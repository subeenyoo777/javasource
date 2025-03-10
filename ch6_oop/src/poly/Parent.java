package poly;

public class Parent {
    String field1;

    public void method1() {
        System.out.println("parent method1()");
    }

    public void method2() {
        System.out.println("parent method2()");
    }
}

class Child extends Parent {
    String field2;

    @Override
    public void method2() {
        // super... 하면 부모까지 부를 수 있음
        System.out.println("Child method2()");
    }

    public void method3() {
        System.out.println("child method3()");
    }
}