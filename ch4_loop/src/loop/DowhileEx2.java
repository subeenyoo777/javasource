package loop;

import java.util.Scanner;

public class DowhileEx2 {

    public static void main(String[] args) {
        // 문제: 문자 입력 받은 후 출력
        // q 문자 입력 시 반복문 프로그램 종료

        Scanner scanner = new Scanner(System.in); // 입력받기
        System.out.println("메세지 입력"); // 띄우기

        String input;

        do {
            System.out.println("종료를 원하면 q입력");
            System.out.printf(">>");
            input = scanner.nextLine();
            System.out.println(input);// 문자 출력

        } while (!input.equals("q"));
        // } while (!input.equalsIgnoreCase("q")); equalsIgnoreCase: 대.소문자 모두 가능

        System.out.println("프로그램 종료합니다");
    }

}
