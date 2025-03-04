package array;

import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {

        // <문제;배열>
        // 길이가 10인 int 형 배열 생성
        // 정수 타입의 배열을 선언할시, 크기를 먼저 선언해야 한다.

        int arr[] = new int[10]; // int 타입으로 배열 선언하면
                                 // 기본으로 설정된 수,'0'이 10번 선언함.

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 10 + 10; // 기존0 값이 변경됨
        }
        // 베열 요소의 값 확인
        // 선택 1)for 구문 사용 : 원하는 형태로 출력 가능
        // 선택 2)항상된 for 구문 : 1번과 장점 같음
        // 3)Arrays.toString(배열명): [배열요소 출력] → 배열 내용을 확인하고자 본다.

        System.out.println(Arrays.toString(arr)); // [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

        // [향상된 for 구문]
        // : 배열 arr 값을 다 가져와서 i 변수로 갖고온다.(인덱스 필요없음)
        // → (단점) 인덱스를 사용 못함.
        // (1)
        // for (int i : arr) {
        // System.out.print(i + "\t");
        // }

        // (2) 향상된 for 구문에서 인덱스 필요하다면?
        // : 인덱스 별도의 선언 필요
        int idx = 0;
        for (int i : arr) {
            System.out.print(++idx + ":" + i + "\n");
        }
        // 1:10
        // 2:20
        // 3:30....으로 출력됨

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}
