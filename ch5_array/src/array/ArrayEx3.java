package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // <문제;배열>
        // 다섯명 학생의 수학 점수를 입력받아 평균, 총합을 구하자.
        int arr[] = new int[5];

        // (1)-1. 배열 하나하나 다 구하기
        // System.out.print("첫번째 학생 점수 입력 >> ");
        // arr[0] = sc.nextInt();

        // System.out.print("두번째 학생 점수 입력 >> ");
        // arr[1] = sc.nextInt();

        // System.out.print("세번째 학생 점수 입력 >> ");
        // arr[2] = sc.nextInt();

        // System.out.print("네번째 학생 점수 입력 >> ");
        // arr[3] = sc.nextInt();

        // System.out.print("다섯번째 학생 점수 입력 >> ");
        // arr[4] = sc.nextInt();

        // (1)-2. for 구문으로 구하기
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d번째 학생 점수 입력 >> ", (i + 1));
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));// [1, 2, 3, 4, 5] 출력됨.

        // (2)총합 구하기
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];// 또는 sum = sum + arr[i];
        }

        // (3)-1.총합
        // System.out.printf("총합: %d, 평균 : %d\n", sum, sum / arr.length);
        // (3)-2.총합(소수점까지) → ~.2f = 소수점 두자리까지, 변수f 변경, double 사용
        System.out.printf("총합: %d, 평균 : %.2f\n", sum, (double) sum / arr.length); //
    }

}
