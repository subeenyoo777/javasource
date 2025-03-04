package array;

import java.util.Arrays;

public class ArraysEx13 {
    public static void main(String[] args) {
        // 2차원 배열
        // 행과 열이 들어옴
        // 타입[][] 베열명 = new 타입 [3][3];

        // 배열 선언 및 생성
        int[][] arr1 = new int[2][2];

        // 기본값 0을 원하는 값으로 초기화
        arr1[0][0] = 73;
        arr1[0][1] = 83;
        arr1[1][0] = 63;
        arr1[1][1] = 53;

        // // 향상된 for 구문
        // for (int[] temp : arr2) {
        // for (int is : temp)
        // System.out.println(is + "\t");
        // }

        // 배열 출력
        // [] 갯수만큼 for 구문 필요
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.println(arr1[1][1] + "\t");
            }
            System.out.println();
        }

        // 값을 알고 있는 경우
        int arr2[][] = {
                { 100, 100, 100 },
                { 20, 30, 40 }
        };

        int sum = 0;
        for (int[] temp : arr2) {
            for (int is : temp)
                sum += is;
        }
        System.out.println("합계:" + sum);

    }

}
