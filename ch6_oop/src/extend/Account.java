package extend;

public class Account {
    // 속성: 계좌번호(account), 이름(name), 잔액(num)
    // 체크 카드 계좌 필요(상속 이용).

    private String ano;
    private String owner;
    private long balance;

    // public Account() {
    // }

    public Account(String ano, String owner, long balance) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }

    // 계좌번호
    public String getAno() {
        return ano;
    }

    // 계좌주 이름
    public String getOwner() {
        return owner;
    }

    // 잔액
    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    void deposit(long amount) {
        this.balance += amount;
    }

    void withdraw(long amount) throws Exception {
        if (amount > balance)
            // 인출액이 잔액보다 크면 막음.
            throw new Exception("잔액확인");
        // return;
        // 인출액이 잔액보다 작으면 출금.
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
    }
}