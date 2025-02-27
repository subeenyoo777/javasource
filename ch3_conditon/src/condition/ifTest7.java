package condition;

import java.util.Scanner;

public class ifTest7 {
  public static void main(String[] args) {
    // num1 변수 선언 후 임의의 값 담기
    // num1 짝수, 홀수 인지 출력하기
    // int num1 = 25;

    // if ( num1 % 2 == 0 ) {
    // System.out.println("짝수입니다.");

    // } else {
    // System.out.println("홀수입니다");

    // 사용자로부터 입력을 받아 num1 변수에 담고,
    // num1 이 짝/홀수인지 확인.

    Scanner scanner = new Scanner(System.in);
    System.out.println("정수입력");
    String input = scanner.nextLine();
    int num1 = Integer.parseInt(input);

    if (num1 % 2 == 0) {
      System.out.println("짝수입니다.");
    } else {
      System.out.println("홀수입니다");

    }

  }

}