package oop;

public class Account {
    // 속성: 계좌번호(account), 이름(name), 잔액(num)
    // 110-10-0100
    // 기능:
    // 예금하다deposit(잔액 = 잔액+예금액),
    // 출금하다withdraw(출금:잔액-출금액)

    // 생성자 두 개(default, 맴버변수 3개 초기화 )
    // toString

    String ano;
    String owner;
    long balance;

    public Account() {
    }

    public Account(String ano, String owner, long balance) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }

    void deposit(long amount) {
        this.balance += amount;
    }

    void withdraw(long amount) {
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
    }

}
