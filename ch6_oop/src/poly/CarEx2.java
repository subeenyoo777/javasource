package poly;

public class CarEx2 {

    public static void main(String[] args) {
        Car2 car2 = new Car2();

        car2.run();

        for (int i = 0; i < 5; i++) {
            // 문제가 있는 타이어 위치
            int problemLocation = car2.run();
            car2.run();

            switch (problemLocation) {
                case 1:
                    System.out.println("앞 왼쪽 교체");
                    car2.forntLeft = new HankookTire(15, "앞 왼쪽");
                    break;
                case 2:
                    System.out.println("앞 오른쪽 교체");
                    car2.forntRight = new KumhoTire(13, "앞 오른쪽");
                    break;
                case 3:
                    System.out.println("뒤 왼쪽 교체");
                    car2.BackLeft = new HankookTire(5, "뒤 왼쪽");
                    break;
                case 4:
                    System.out.println("뒤 오른쪽 교체");
                    car2.backRight = new KumhoTire(13, "뒤 오른쪽");
                    break;

                default:
                    break;
            }

        }
    }
}
