package poly;

public class CarEx {
    public static void main(String[] args) {
        Car car = new FireEngine();

        car.drive();
        car.stop();

        // car.water... 안됨
        // 형변환 필요

        // FireEngine fe = (FireEngine) car;
        // fe.water(); 또는

        ((FireEngine) car).water();

        // instance of
        // : 참조변수가 참조하고 있는 실제 인스턴스의 타입을 알아보는 것.
        if (car instanceof FireEngine) {
            System.out.println("FireEngine의 instance 이다.");
        }

        if (car instanceof Car) {
            System.out.println("Car의 instance 이다.");
        }

        Car car2 = new Car();
        // (FireEngine)car2; 안된다는 의미, 강제 형변환 x

        if (car2 instanceof FireEngine) {
            System.out.println("car2  - FireEngine instance 임");
        }

        if (car2 instanceof Car) {
            System.out.println("car2  - car의 instance 임");
        }

    }
}
