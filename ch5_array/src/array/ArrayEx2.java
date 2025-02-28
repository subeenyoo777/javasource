package array;

import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {

        // 정수 타입의 배열을 선언할시, 크기를 먼저 선언해야 한다.
        // 길이가 10인 int 형 배열 생성

        int arr[] = new int[10]; // int 타입으로 배열 선언하면 '0'이 10번 선언함.

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 10 + 10; // 기존0 값을 변경했다.
        }
        // 베열 요소의 값 확인
        // 선 1)for 구문 사용 : 원하는 형태로 출력 가능
        // 선 2)항상된 for 구문 : 1)장점 같음
        // 3)Arrays.toString(배열명): [배열요소 출력] -확인용으로 본다.-

        System.out.println(Arrays.toString(arr)); // [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

        // 향상된 for 구문
        // arr 값을 다 가져와서 i 변수로 갖고온다.(인덱스 필요없음)
        // → 인덱스를 사용 못하는게 단점.
        // for (int i : arr) {
        // System.out.print(i + "\t");
        // }

        // 향상된 for 구문에서 인덱스 필요하다면?
        int idx = 0;
        for (int i : arr) {
            System.out.print(++idx + ":" + i + "\n");
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}
