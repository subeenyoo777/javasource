package poly;

public class ChildEx {
    public static void main(String[] args) {
        Child child1 = new Child();
        Parent parent = new Child();

        child1.method1(); /// print:parent method1()
        child1.method2(); /// print:Child method2()
        child1.method3(); /// print:child method3()

        // parent 로 접근할 수 있는 범위
        parent.method1();// print:parent method1()
        parent.method2();// print:Child method2()

        // parent.method3();//is undefined for the type Parent..

        // method3 사용하려면? 어떻게 접근??
        // 부모 = 자식 (○)
        Child child2 = (Child) parent; // 강제 형 변환
        child2.method3();

        // java.lang.Class_Cast_Exception.. exception 나면 오류뜸.
        // 부모를 자식으로 강제 casting 을 못한다. 자식 = 부모(x)
        Parent parent2 = new Parent();
        child2 = (Child) parent2;// 컴파일 과정까지는 넘어가나
        child2.method3();// 런타임... 실행할 때 오류난다.
    }
}