package extend;

public class BonusPointAccount extends Account {
    private int bonusPoint; // 보너스 포인트를 저장하는 변수

    // [생성자]부모 클래스인 Account 클래스의 생성자를 호출하여 계좌 번호, 소유자, 잔액을 초기화.
    public BonusPointAccount(String ano, String owner, long balance, int bonusPoint) {
        super(ano, owner, balance); // 부모 클래스의 생성자 호출
        this.bonusPoint = bonusPoint; // 보너스 포인트 초기화
    }

    // 외부에서 보너스 포인트를 조회(반환)할 메서드
    public int getBonusPoint() {
        return bonusPoint;
    }

    @Override // 부모 클래스의 메서드를 자식 클래스에서 재정의
    void deposit(long amount) {
        // 예금하다
        super.deposit(amount); // 부모 클래스의 deposit 호출
        // 보너스 포인트 추가

        // 보너스 포인트 = 보너스 포인트 + (예금액 * 1%)
        // 예금하다 메서드 수정
        // bonusPoint += amount / 100;
        bonusPoint += amount * 0.01;
    }
}
