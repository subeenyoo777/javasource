package poly;

public class Car2 {
    // 자동차 바퀴 장착
    // 관계 (is ~이다/hasa ~가지고 있다)

    // hasa 관계_멤버변수로 선언
    Tire forntLeft = new HankookTire(6, "앞왼쪽");
    Tire forntRight = new HankookTire(2, "앞오른쪽");
    Tire BackLeft = new KumhoTire(3, "뒤왼쪽");
    Tire backRight = new KumhoTire(4, "뒤오른쪽");

    int run() {
        System.out.println("[자동차가 주행 중입니다.]");
        if (!forntLeft.roll()) {
            stop();
            return 1;
        } else if (!forntRight.roll()) {
            stop();
            return 2;
        } else if (!BackLeft.roll()) {
            stop();
            return 3;
        } else if (!backRight.roll()) {
            stop();
            return 4;
        }
        return 0;
    }

    void stop() {
        System.out.println("[자동차가 멈춥니다]");
    }

}
