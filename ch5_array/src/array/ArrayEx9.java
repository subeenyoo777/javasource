package array;

import java.util.Arrays;

public class ArrayEx9 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        // 초기값은 현재 0값이 9번 들어가 있는 것.
        // numArr 0~9 초기화하기
        for (int i = 1; i < numArr.length; i++) {
            numArr[i] = i;
        }
        System.out.println(Arrays.toString(numArr));
        // 결과값: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        // // 값의 위치를 바꾸고 싶을 때
        // int a = 10, b = 15;
        // int temp = a; // a나 b 옮긴다(기존 변수 값이 날아가지 않기 위해).
        // a = b; // b 값을 a에 담는다.
        // b = temp; // 기존 a값 담긴다.

        // 교환 위치를 임의로 생성함(0~9 사이의 값)
        for (int i = 0; i < 100; i++) {
            int pos = (int) (Math.random() * 10); // 10 곱하면 0~9나온다.

            int temp = numArr[0];
            numArr[0] = numArr[pos];
            numArr[pos] = temp; // 기존 a값 담긴다.

        }
        System.out.println(Arrays.toString(numArr));
    }
}
