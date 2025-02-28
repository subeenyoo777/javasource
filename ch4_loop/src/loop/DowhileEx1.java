package loop;

import java.util.Scanner;

public class DowhileEx1 {

    public static void main(String[] args) {

        // 문제: 컴퓨터가 1~100 임의의 수 생성
        // 생성된 숫자 만들기

        // 1~100 사이의 정수를 입력 받아서 컴퓨터 숫자 비교 후
        // 더 큰 수를 입력 OR 더 작은 수 입력 OR 정답

        Scanner scanner = new Scanner(System.in);

        int answer = (int) (Math.random() * 100) + 1;

        int input = 0; // 사용자의 답변을 저장

        // 먼저 do를 하기에(조건 검사 나중 )
        // 무조건 한번은 실행함.
        do {
            System.out.print("1~100 사이의 정수 입력 >> ");
            input = scanner.nextInt();

            if (answer < input) {
                System.out.println("더 작은 수 입력");
            } else {
                System.out.println("더 큰 수 입력");

            }

        } while (input != answer);
        System.out.println("정답입니다. 프로그램 종료합니다.");
    }

}
