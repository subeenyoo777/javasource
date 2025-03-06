package oop;

import java.util.Arrays;

public class ReferenceParamEx2 {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 6, 5, 4 };
        printArr(arr);
        sortArr(arr);

        // 정렬 후 결과 출력
        printArr(arr);
        System.out.println("sum =" + sumArr(arr));
    }

    static void printArr(int[] arr) {
        // [3,2,1,6,5,4]..출력되게
        System.out.println(Arrays.toString(arr));
    }

    static int sumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static void sortArr(int[] arr) {
        // 버블정렬...원본이 달라졌다.
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
// 결과 값 달라짐
// [3, 2, 1, 6, 5, 4]
// [1, 2, 3, 4, 5, 6]