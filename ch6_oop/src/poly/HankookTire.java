package poly;

public class HankookTire extends Tire {

    public HankookTire(int maxRotation, String location) {
        super(maxRotation, location);

    }

    @Override
    public boolean roll() {
        ++accumulateRotation;
        if (accumulateRotation < maxRotation) {
            System.out.println(location + "HankookTire 수명: " + (maxRotation + accumulateRotation) + "회");
            return true;
        } else {
            System.out.println("***" + location + "HankookTire 펑크 ***");
            return false;
        }
    }
}
