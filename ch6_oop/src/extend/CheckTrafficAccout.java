package extend;

public class CheckTrafficAccout extends CheckingAccount {

    // 교통카드 기능 여부 메서드
    private boolean hasTrafficCard;

    public CheckTrafficAccout(String ano, String owner, long balance, String cardNo, boolean hasTrafficCard) {
        super(ano, owner, balance, cardNo);
        this.hasTrafficCard = hasTrafficCard;
    }

    // is는 주로 boolean 값이 true나 false로 답할 수 있는 상태를 묻는 질문을 나타냅니다.
    public boolean isHasTrafficCard() {
        return hasTrafficCard;
    }

    // 교통비를(바로)지불
    long payTrafficCard(String cardNo, int amount) throws Exception {
        // 교통카드 있다면 교통비 지불
        if (!hasTrafficCard) {
            throw new Exception("교통카드 기능이 없습니다");
        }
        // 카드 번호, 잔액연부 확인 후 지불한다.
        return pay(cardNo, amount);
        // (=) long balance = pay(cardNo, amount);
        // return balance;
    }

}
