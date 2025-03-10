package poly;

public class AnimalEx {

    public static void main(String[] args) {

        // 인스턴스 생성하는 기본 방법
        // Animal animal = new Animal();
        // Canine canine = new Canine();
        // Feline feline = new Feline();

        // Cat cat = new Cat();
        // Dog dog = new Dog();

        // (왼)부모 = new 자식(오)
        // -------->생성되는 객체(instance)는 오른쪽 것
        Animal animal = new Animal();// 자신을 받을 수 있음
        Animal animal1 = new Canine();
        Animal animal2 = new Feline();
        Animal animal3 = new Cat();
        Animal animal4 = new Dog();
        Animal animal5 = new Dog();

        // 오버라이딩... 형변환 이유로 한다.

        // Type mismatch: cannot convert from Cat to Dog
        // Dog dog = new Cat();
        // 아무런 관계 없을 땐(형제..) 오류가 난다.
    }
}
