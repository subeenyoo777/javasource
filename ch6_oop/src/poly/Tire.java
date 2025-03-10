package poly;

public class Tire {

    int maxRotation;// 최대 회전수
    int accumulateRotation; // 누적 회전수
    String location;// 타이어 위치

    public Tire(int maxRotation, String location) {
        this.maxRotation = maxRotation;
        this.location = location;
    }

    public boolean roll() {
        ++accumulateRotation;

        if (accumulateRotation < maxRotation) {
            System.out.println(location + "Tire 수명: " + (maxRotation + accumulateRotation) + "회");
            return true;
        } else {
            System.out.println("***" + location + "Tire 펑크 ***");
            return false;
        }

    }

}
