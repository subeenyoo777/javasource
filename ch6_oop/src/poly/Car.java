package poly;

public class Car {
    String color;
    int door;

    void drive() {
        System.out.println("Drive, Brrr~~");
    }

    void stop() {
        System.out.println("Stop!!");
    }

}

class FireEngine extends Car {
    void water() {
        System.out.println("Water!!");
    }
}
