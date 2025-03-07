//1. 패키지 > 2.(필요할시)import: 패키지명 +  클래스명 > 3.
package extend;

import java.util.Scanner;

public class AccountEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // new를 하면,
        // "CheckingAccount 클래스에 (default) 생성자를 무조건 호출".
        // ="부모의 인스턴스도 같이 생성됨"
        CheckingAccount cAccount = new CheckingAccount("110-11", "hong", 100000,
                "123-1232");

        // // 부모의 인스턴스도 생성되있다.----------------------- 초기값
        System.out.println("계좌번호: " + cAccount.getAno()); // null
        System.out.println("계좌주: " + cAccount.getOwner());// null
        System.out.println("잔액: " + cAccount.getBalance());// 0
        System.out.println("체크카드번호: " + cAccount.getAno());// null
        try {
            // card나 잔액을 확인해주세요
            // System.out.println("현재잔액: " + cAccount.pay("453", 100));
            System.out.println("현재잔액: " + cAccount.pay("123-1232", 100));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // CreditLineAccount
        CreditLineAccout creditLineAccout = new CreditLineAccout("110-11", "hong", 100000, 300000);
        try {
            creditLineAccout.withdraw(250000);
            System.out.println("현재잔액: " + creditLineAccout.getBalance());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // BonusPointAccount
        BonusPointAccount bonusPointAccount = new BonusPointAccount("110-11", "홍길동", 100000, 0);
        bonusPointAccount.deposit(100000);
        System.out.println("보너스 포인트: " + bonusPointAccount.getBonusPoint());

        // CheckTrafficAccout
        CheckTrafficAccout checkTrafficAccout = new CheckTrafficAccout("110-11", "홍길동", 100000,
                "123-1232", false);

        CheckTrafficAccout checkTrafficAccout2 = new CheckTrafficAccout("110-11", "홍길동", 100000,
                "123-1232", true);

        try {
            System.out.println("교통카드 지불 후 현재 잔액: " + checkTrafficAccout2.payTrafficCard("123 - 1232", 1750));
            System.out.println("현재 잔액: " + checkTrafficAccout.payTrafficCard("123 - 1232", 1750));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
