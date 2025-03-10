package poly;

public class CarEx3 {
    public static void main(String[] args) {

        HankookTire frontLeft = new HankookTire(1, "앞 왼쪽");
        HankookTire frontRight = new HankookTire(1, "앞 오른쪽");
        HankookTire backLeft = new HankookTire(1, "뒤 왼쪽");
        HankookTire backRight = new HankookTire(1, "뒤 오른쪽");
        
        Car3 car3 = new Car3(frontLeft, frontRight, backLeft, backRight);
        
        car3 = new Car3(new HankookTire(1, "앞 왼쪽") , frontRight,
               new HankookTire(1, "뒤 왼쪽"), backRight);
               

               System.out.println(car3.num); // 값: 0
               System.out.println(car3.forntLeft); // 값: null

        // java.lang.Null_Pointer_Exception
        // : null(아직 가르키고 있지 않고 있기)때문
        System.out.println(car3.forntLeft.accumulateRotation);
    }
}
