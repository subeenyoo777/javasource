package api.object;

public class ObjectEx {
    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = new Object();

        // 주소 값 같은지 질문(같은 인스턴스를 가리키고 있는가?)
        System.out.println(object1.equals(object2) ? "같음" : "다름");
        System.out.println(object1 == object2 ? "같음" : "다름");

        // print) java.lang.Object@7a81197d
        System.out.println("object toString()" + object1.toString());

        Value value1 = new Value(10);
        Value value2 = new Value(10);
        // print ) api.object.Value@3a71f4dd
        System.out.println("value1 toString()" + value1.toString());

        // 부모에게 상속 시 참조변수의 주소값 비교
        // 맴버변수의 값 비교 equals 재정의: 맴버변수 value 의 값이 같은지 비교
        System.out.println(value1.equals(value2) ? "value1 == value2" : "value1 != value2");

        Person p1 = new Person("hong123", "홍길동");
        Person p2 = new Person("hong123", "백동수");

        System.out.println(p1.equals(p2) ? "p1 == p2" : "p1 != p2");
        // print ) api.object.Person@7adf9f5f
        System.out.println("p1 toString()" + p1.toString());
    }
}