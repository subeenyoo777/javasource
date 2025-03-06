package oop;

public class Account {
    // 속성: 계좌번호(account), 이름(name), 잔액(num)
    // 110-10-0100
    // 기능:
    // 예금하다deposit(잔액 = 잔액+예금액),
    // 출금하다withdraw(출금:잔액-출금액)

    // 생성자 두 개(default, 맴버변수 3개 초기화 )
    // toString

    private String ano;
    private String owner;
    private long balance;

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

    public Account() {
    }

    void deposit(long amount) {
        this.balance += amount;
    }

    void withdraw(long amount) {
        if (amount > balance)
            // 인출액이 잔액보다 크면 막음.
            return;
        // 인출액이 잔액보다 작으면 출금.
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
    }

}
