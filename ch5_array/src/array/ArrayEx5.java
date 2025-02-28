package array;

import java.util.Arrays;
// import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {

        // char 값 5개

        // 타입 배열명 = {;}
        char chArr[] = { 'a', 'b', 'c', 'd', 'e' }; // 배열 생성 및 선언

        // 길이
        System.out.println("길이: " + chArr.length); //

        // 배열 요소 확인
        System.out.println(chArr); // 배열에서 char 타입 선언 시에만 값이 나오지 ,보통은 주소로 나온다.(배열명에는 주소 저장되있음)
        System.out.println(Arrays.toString(chArr)); // [~]모양이다

        // 베열 요소 변경-> 인덱스 지정
        chArr[2] = 'f';
        System.out.println(Arrays.toString(chArr));

        // double 배열 선언, 생성(5)
        double dblArr[] = { 90.5, 88.12, 78.45, 62.45, 55 };
        System.out.println(dblArr); // [D@1be6f5c3

        // Arrays.toString(배열명) : 배열명이 가리키는 곳의 실제 값을 출력
        System.out.println(Arrays.toString(chArr));

    }

}
