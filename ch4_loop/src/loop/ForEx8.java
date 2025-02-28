package loop;

import java.util.Scanner;

// 주제: 중첩 for
//문제:  *
//       **
//       ***
//       ****
//       *****

// 1.먼저 하나하나 구문을 어떻게 할지 생각해본 다음에
// 2. 반복적인 부분을 찾아서 중첩하면 됨

public class ForEx8 {
    public static void main(String[] args) {

        // for (int i = 1; i <= 1; i++) {
        // System.out.print("*"); // ln...없을 시 옆으로 출력됨
        // }

        // System.out.println();
        // for (int i = 1; i <= 2; i++) {
        // System.out.print("*");
        // }

        // System.out.println();
        // for (int i = 1; i <= 3; i++) {
        // System.out.print("*");
        // }

        // System.out.println();
        // for (int i = 1; i <= 4; i++) {
        // System.out.print("*");
        // }

        // System.out.println();
        // for (int i = 1; i <= 5; i++) {
        // System.out.print("*");
        // }
        // System.out.println();

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) { // i가 1,2,3,4,5..변하는 값을 갖고 있다.
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
