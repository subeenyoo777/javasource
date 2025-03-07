package extend;

public class CheckingAccount extends Account {
    // 은행계좌 + 체크카드
    private String cardNo; // 체크카드 계좌

    // public CheckingAccount() {
    // // 부모의 default 생성자 호출
    // super();
    // }

    public CheckingAccount(String ano, String owner, long balance, String cardNo) {
        super(ano, owner, balance);// 부모 생성자를 호출함
        this.cardNo = cardNo;// this 는 나.
    }

    // 비용(체크카드 사용액) 지불
    // 카드 번호와 체크카드 번호가 일치 여부 확인
    // (-)경우 없도록 잔액 > 사용액
    long pay(String cardNo, int amount) throws Exception {
        // getBalance() 는 부모 클래스에서 private으로 선언됐기때문
        if (!this.cardNo.equals(cardNo) || getBalance() < amount) {
            throw new Exception("carNo나 잔액을 확인해 주세요");
        }
        // 비용지불: 잔액 - 사용액;
        withdraw(amount);
        // 잔액 반환
        return getBalance();

    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardNo() {
        return cardNo;
    }

}
