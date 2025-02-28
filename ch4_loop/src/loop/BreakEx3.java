package loop;

import java.util.Scanner;

public class BreakEx3 {
    public static void main(String[] args) {

        boolean run = true; // 무한 루프
        Scanner sc = new Scanner(System.in);

        int balance = 0; // 잔액 용도(입력하는 다른 것과 다르게 계속 남아있어야 하므로 여기에 선언)

        while (run) {

            System.out.println("========================================");
            System.out.println("1. 예금 | 2. 츨금 | 3. 잔고 | 4. 종료");
            System.out.println("========================================");

            System.out.println("메뉴 번호 입력 >> ");
            int menu = sc.nextInt();

            int amount = 0; // 예금, 출금액

            // 돈입력받을 변수/잔액 변수 필요.
            // 수일치 밖에 변수 선언//금액이 계소ㄱ해서 남기 위해서!

            switch (menu) {
                case 1:
                    // 예금액 입력
                    System.out.print("예금액>>");
                    // amount = sc.nextInt(); // int 받음//sc.nextLine(); //string 받음

                    // 잔액 = 잔액 + 예금액
                    // balance += amount;
                    balance += sc.nextInt(); // amount = sc.nextInt(); ...balance += amount;.
                    break;

                case 2:
                    // 출금액 입력
                    System.out.print("출금액>>");

                    // 잔액 = 잔액 - 출금액
                    balance -= sc.nextInt();

                    // amount = sc.nextInt();
                    // balance -= amount;
                    break;

                case 3:
                    // 잔액 출력
                    System.out.println("잔액: " + balance);

                    break;
                case 4:
                    run = false;
                    break; // 반복문 종료하는 용도

                default:
                    break;
            }

        }

    }
}
