package poly;

public class Car3 {
    // 맴버 변수 타입 : 기본, 객체(대문자로 시작, 배열 포함)
    // 기본: 정수-0, 실수-0.0, boolean-false etc
    // 객체: null

    // 객체 초기화는 무조건 new~ 하며 선언!!
    Tire forntLeft = new HankookTire(5, "앞 왼쪽");
    Tire forntRight;
    Tire BackLeft;
    Tire BackRight;

    int num;

    // [초기화] 1)생성자 or 2)set 메서드
    // 3)맴버 변수 선언하며 초기화 Tire forntRight = new HankookTire(2, "앞오른쪽");
    public Car3(Tire forntLeft, Tire forntRight, Tire backLeft, Tire backRight) {
        this.forntLeft = forntLeft;
        this.forntRight = forntRight;
        BackLeft = backLeft;
        BackRight = backRight;
    }

}
