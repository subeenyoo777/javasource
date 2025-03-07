// (생성자 명시하지 않을 시)default로 선언되있음
// CreditLineAccout(){
// super();
// }

package extend;

public class CreditLineAccout extends Account {
    // 마이너스 계좌
    // 은행 계좌 + 마이너스 속성(잔액 + 마이너스 허용 한도)
    private int creditLine; // 마이너스 한도

    public CreditLineAccout(String ano, String owner, long balance, int creditLine) {
        super(ano, owner, balance);
        this.creditLine = creditLine;
    }

    // 오버라이딩
    // 잔액 + 마이너스한도 - 사용액
    @Override
    void withdraw(long amount) throws Exception {
        if (super.getBalance() + this.creditLine < amount) {
            throw new Exception("한도 범위를 초과합니다.");
        }
        // 잔액 = 잔액 - 사용액
        super.setBalance(super.getBalance() - amount);
    }

}
