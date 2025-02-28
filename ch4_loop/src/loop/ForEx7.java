package loop;

import java.util.Scanner;

// 주제: 중첩 for
//문제:  ******************
//       ******************
//행과 열을 갖고 있을 시 이중 for 구문 사용
public class ForEx7 {
    public static void main(String[] args) {

        // // 별 * 10개 출력
        // for (int i = 0; i < 10; i++) {
        // System.out.print("*"); // ln...없을 시 옆으로 출력됨
        // }
        // System.out.println();
        // for (int i = 0; i < 10; i++) {
        // System.out.print("*");
        // System.out.println();
        // for (int i = 0; i < 10; i++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // for (int i = 0; i < 10; i++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // for (int i = 0; i < 10; i++) {
        // System.out.print("*");
        // }

        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j < 10; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        System.out.println();
        for (int i = 0; i < 2; i++) { // 열 부분(세로)몇 번 반복할 지는 바깥 for문
            for (int j = 0; j < 3; j++) {
                System.out.print(j + "\t"); // 행 부분(가로)는 안쪽 for에서.
            }
            System.out.println();
        }

    }
}
