package array;

import java.util.Arrays;

public class ArraysEx12 {
    public static void main(String[] args) {

        // 배열 생성 시 변수의타입에 따라 기본값이 됨.
        // int: 0, boolean: false, double(float): 0.0
        // String: null
        String[] names = { "kim", "park", "yi" };
        String[] name = new String[2];
        System.out.println(Arrays.toString(name));// 초기값: [null, null]

        int[] arr1 = new int[2];
        System.out.println(Arrays.toString(arr1));// [0,0]

        boolean[] arr2 = new boolean[2];
        System.out.println(Arrays.toString(arr2));// [false , fasle]
    }

}
