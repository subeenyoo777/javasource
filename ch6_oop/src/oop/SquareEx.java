package oop;

import java.util.Arrays;

public class SquareEx {

    public static void main(String[] args) {

        Square square = new Square(10);
        System.out.println("사각형 면적 " + square.getArea());

        Square square2 = new Square(7);
        System.out.println("사각형 면적 " + square2.getArea());

        // 타입 배열명 = new 타입[5];
        // //타입 배열명 = {};
        // 객체배열
        // 객체(클래스)명 배열명 = new 객체(클래스)명[5];

        // 객체는 대문자로 시작함...대부분 기본 값이 0임.
        Square squareArr[] = new Square[5];
        System.out.println(Arrays.toString(squareArr));// [null, null, null, null, null]
        squareArr[0] = new Square(15);
        // System.out.println("첫번째 면적:" + squareArr[0].getArea());

        squareArr[1] = new Square(7);
        // System.out.println("두번째 면적:" + squareArr[1].getArea());

        squareArr[2] = new Square(9);
        // System.out.println("세번째 면적:" + squareArr[2].getArea());

        squareArr[3] = new Square(8);
        // System.out.println("네번째 면적:" + squareArr[3].getArea());

        squareArr[4] = new Square(12);
        // System.out.println("다섯번째 면적:" + squareArr[4].getArea());

        for (int i = 0; i < squareArr.length; i++) {
            System.out.printf("%d 번째 면적:: %d\n", (i + 1), squareArr[i].getArea());// 인덱스는 i로!
        }

        // 배열의 각 타입의 기본 값: 정수형 0, 실수형 0.0 불린형 false
        int arr[] = new int[5];
        System.out.println(Arrays.toString(arr));// [0, 0, 0, 0, 0]
        arr[0] = 15;
        arr[1] = 12;
        arr[2] = 13;
        arr[3] = 14;
        arr[4] = 16;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}