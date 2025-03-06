package oop;

public class SingletonEx {

    public static void main(String[] args) {
        // Singleton singleton = new Si..(); private 선언했기에 못함

        Singleton singleton1 = Singleton.getInsatace();
        Singleton singleton2 = Singleton.getInsatace();
        System.out.println(singleton1 == singleton2 ? "같은 객체" : "다른 객체");
        // re: 같은 객체

        Student student1 = new Student();
        Student student2 = new Student();
        // new 할 때마다 새롭게 만들어짐
        // new 못하게 하려면, private으로 못하게 막는다.
        System.out.println(student1 == student2 ? "같은 객체" : "다른 객체");
        // re: 다른 객체
    }
}
