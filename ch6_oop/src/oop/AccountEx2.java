package oop;

import java.util.Scanner;

public class AccountEx2 {

    // static은 static 을 불러야 오류가 안난다.
    // →1. instance 생성해서 쓴다.
    private static Account account;
    static Scanner sc = new Scanner(System.in); // system.in : 키보드 <> system.out: 화면

    public static void main(String[] args) {

        // → 2. scanner, account.. 를 static 붙인다
        // AccountEx2 obj = new AccountEx2();
        boolean run = true;

        // 사용자가 5번 돌리기 전까진 계속 돌린다.
        while (run) {
            System.out.println("-----------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("-----------------------------------------------------");

            // sc.nextLine: scanner 클래스에 next~ 메서드 있다.
            System.out.print("선택 >> ");
            int menu = Integer.parseInt(sc.nextLine());

            // Integer.parseInt(String)
            // : 문자열을 정수(int)로 변환하는 메서드

            switch (menu) {
                case 1:
                    account = createAccout();
                    break;
                case 2:
                    accountList(account);
                    break;
                case 3:
                    deposit(account);
                    break;
                case 4:
                    withdraw(account);
                    break;
                case 5:
                    run = false;
                    break;

                default:
                    System.out.println("번호 확인");
                    break;
            }
        }

    }

    // 내부용 메서드용 private../
    // createAccout: 사용자 계좌 생성 메서드
    private static Account createAccout() {
        // 계좌번호 입력
        System.out.println("계좌번호:");
        String ano = sc.nextLine();

        // 계좌주
        System.out.println("계좌주:");
        String owner = sc.nextLine();

        // 잔액
        System.out.println("금액:");
        int balance = Integer.parseInt(sc.nextLine());

        // Account account = new Account("110-11", "홍길동", 10000000);
        return new Account(ano, owner, balance);
    }

    // 메서드의 오류는 일차적으로 반환 타입과의 호환이 안 맞기 때문.
    // 기존의 일단 작성한 void 없앰

    // accountList 메서드
    private static void accountList(Account account) {
        System.out.println("------------------------------------------");
        System.out.println("계좌목록");
        System.out.println("------------------------------------------");

        System.out.printf("%s\t%s\t%d\n", account.getAno(), account.getOwner(), account.getBalance());
    }

    // deposit 메서드
    private static void deposit(Account account) {
        // 계좌번호 입력 받기 => 사용자가 입력한 계좌번호와 account의 계좌 일치 여부 확인
        // 맞다면 예금액 입력받기 => 잔액 + 예금액
        System.out.println("계좌번호:");
        String ano = sc.nextLine();

        if (!ano.equals(account.getAno()))
            return;

        System.out.println("예금액 : ");
        int balance = Integer.parseInt(sc.nextLine());
        account.deposit(balance);
    }

    private static void withdraw(Account account) {
        // 계좌번호 입력 받기 => 사용자가 입력한 계좌번호와 account의 계좌 일치 여부 확인
        // 맞다면 출금액 입력받기 => 잔액 - 예금액
        System.out.println("계좌번호:");
        String ano = sc.nextLine();

        if (!ano.equals(account.getAno()))
            return;

        System.out.println("출금액 : ");
        int balance = Integer.parseInt(sc.nextLine());

        account.withdraw(balance);
    }

}
