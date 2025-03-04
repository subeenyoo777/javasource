package array;

import java.util.Arrays;

public class ArrayEx8 {
    public static void main(String[] args) {

        // 배열에 저장된 값 중에서 최대값과 최소값 구하기
        int[] score = { 75, 88, 91, 33, 100, 55, 95 };

        int max = score[0], min = score[0];

        for (int i = 1; i < score.length; i++) {
            if (max < score[i]) {
                max = score[i];
            } else if (min > score[i]) {
                min = score[i];
            }
        }
        ;
        System.out.println("최대값:" + max);
        System.out.println("최소값:" + min);
    }

    // char result[] = new char[abc.length + num.length];
    // System.arraycopy(abc, 0, result, 0, abc.length);

    // System.out.println(Arrays.toString(result));
}
