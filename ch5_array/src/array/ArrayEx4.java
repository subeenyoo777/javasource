package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 문제: N 명 학생의 수학 점수를 입력받아 평균, 총합을 구하자.
        int arr[]; // 선언만 한 배열.
        System.out.printf("학생의 수 입력 >>");
        int num = sc.nextInt(); // 입력받은 학생의 수를 sum 에 담음

        // 배열 생성 키워드는 new!
        arr = new int[num];// 배열 값 동적으로 넣는 법

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d 번째 학생 점수 입력 >> ", (i + 1)); // Format Conversion Exception
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        // 평균, 총합 구하기
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];// sum = sum + arr[i];
        }
        // System.out.printf("총합: %d, 평균 : %d\n", sum, sum / arr.length);
        System.out.printf("총합: %d, 평균 : %.2f\n", sum, (double) sum / arr.length); //
        // .2 = 소수점 두자리까지 보여줘.
    }

}
