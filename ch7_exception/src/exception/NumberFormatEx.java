package exception;

import java.util.Scanner;

public class NumberFormatEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("입력 >> ");

        try {
            // Number_Format_Exception
            int num = Integer.parseInt(sc.nextLine());

            System.out.println(num);

        } catch (Exception e) {
            e.printStackTrace(); // 개발할 때만
            System.out.println("문자를 입력하셨는지 확인해주세요");
        } finally {
            System.out.println("무조건 실행");
        }

        try {
            int num[] = new int[1];
            System.out.println(num[3]);

        } finally { // catch 필수 아님, finally 가능
            System.out.println("여기도 무조건 실행");
        }

        sc.close();

    }
}
