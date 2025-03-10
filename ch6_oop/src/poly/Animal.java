package poly;

public class Animal {
    Animal() {
        System.out.println("Animal 생성자");
    }
}
// super();숨어져 있다.

class Canine extends Animal {
    Canine() {
        System.out.println("Canine 생성자");
    }
}

class Feline extends Animal {
    Feline() {
        System.out.println("Feline 생성자");
    }
}

class Dog extends Canine {
    Dog() {
        System.out.println("Dog 생성자");
    }
}

class Cat extends Feline {
    Cat() {
        System.out.println("Cat 생성자");
    }
}
