package oop;

import java.util.Scanner;

public class AccountEx3 {
    // 계좌 여러개 생성하는 프로그램

    private static Account account[] = new Account[100];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            System.out.println("-----------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("-----------------------------------------------------");

            System.out.print("선택 >> ");
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    createAccout();
                    break;
                case 2:
                    accountList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
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

    private static void createAccout() {
        // 계좌번호 입력
        System.out.println("계좌번호 입력:");
        String ano = sc.nextLine();

        // 계좌주
        System.out.println("계좌주 입력:");
        String owner = sc.nextLine();

        // 잔액
        System.out.println("금액 입력:");
        int balance = Integer.parseInt(sc.nextLine());

        for (int j = 0; j < account.length; j++) {
            // account[j]: 첫번째 만나는 null 이면
            if (account[j] == null) {
                account[j] = new Account(ano, owner, balance);
                System.out.println("계좌가 생성되었습니다");
                break; // 루프종료
            }
        }
    }

    private static void accountList() {
        System.out.println("------------------------------------------");
        System.out.println("계좌목록");
        System.out.println("------------------------------------------");

        // 배열 출력(1)
        // for (int i = 0; i < account.length; i++) {
        // // account[i]: 첫번째 만나는 null 아니면
        // if (account[i] != null) {
        // System.out.printf("%s\t%s\t%d\n", account[i].getAno(), account[i].getOwner(),
        // account[i].getBalance());
        // }
        // }

        // 배열 출력(2)
        for (Account acc : account) {
            if (acc != null) {
                System.out.printf("%s\t%s\t%d\n", acc.getAno(), acc.getOwner(), acc.getBalance());
            }
        }
    }

    private static void deposit() {
        // 계좌번호와 account 일치하다면 예금액 입력 => 잔액 + 예금액
        System.out.println("계좌번호:");
        String ano = sc.nextLine();

        System.out.println("예금액 : ");
        int balance = Integer.parseInt(sc.nextLine());
        Account findAcc = findAccount(ano);

        // findAcc 가 null 일 때, 메서드에 접근하면 Null_point_Exception 발생
        if (findAcc != null) {
            findAcc.deposit(balance);
        }
    }

    private static void withdraw() {
        // 계좌번호와 account 일치하다면 출금액 입력 => 잔액 - 예금액
        System.out.println("계좌번호:");
        String ano = sc.nextLine();

        System.out.println("출금액 : ");
        int balance = Integer.parseInt(sc.nextLine());

        Account findAcc = findAccount(ano);
        // findAcc 가 null 일 때, 메서드에 접근하면 Null_point_Exception 발생
        if (findAcc != null) {
            findAcc.withdraw(balance);
        }
    }

    private static Account findAccount(String ano) {
        // 입력값 ano와 account 배열 계좌 중에서 일치하는 계좌 찾기

        Account acc = null;
        for (int i = 0; i < account.length; i++) {
            // null 이 아니며, account[i].getAno == ano break;
            // return account[i]

            if (account[i] != null) {
                // if (account[i].getAno().equals(ano)) { // equals 쓰라
                // return account[i];
                // }

                if (account[i].getAno().equals(ano)) {
                    acc = account[i];
                    break;
                }
            }
        }
        return acc;
    }

}
