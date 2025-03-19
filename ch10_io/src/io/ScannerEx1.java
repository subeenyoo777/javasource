package io;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        // 키보드 입력
        // 1) InputStream
        // 2)Scanner

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력");
        int num1 = sc.nextInt(); // 5 엔터
        System.out.println("연산자 입력 (+. -, *, /)");
        // String op = sc.nextLine(); // 줄 단위로 인식

        String op = sc.next();

        System.out.println("숫자입력");
        int num2 = sc.nextInt();

        // 숫자 입력
        // 5 엔터
        // 연산자 입력 (+. -, *, /)
        // 5엔터

    }
}
