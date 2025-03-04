package array;

import java.util.Arrays;

public class ArrayEx6 {
    public static void main(String[] args) {
        // 배열: 한번 생성하면 길이 변경 불가.// APPEND 개념이 없다.

        int arr[] = { 78, 99, 52, 35, 14 };

        // 기존 배열에 값을 추가 해야 한다면
        // 새로운 배열 공간 생성
        int tmp[] = new int[10];

        // 기존 배열 값 복사

        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        System.out.println(Arrays.toString(tmp));

        // 범위를 지정해서 한번에 복사 가능함
        // System.arraycopyy(Object src, int srcPos, Object dest, int destPos, int
        // length)
        // System.arraycopyy(원본배열, 원본배열에서 복사할 시작 위치,새배열, 새배열 위치, 복사할 개수 )
        // System.arraycopy(arr, 0, tmp, 0, 0);

        int tmp2[] = new int[10];
        System.arraycopy(arr, 0, tmp2, 1, arr.length);
        System.out.println(Arrays.toString(tmp2)); // [0, 78, 99, 52, 35, 14, 0, 0, 0, 0]

    }

}
