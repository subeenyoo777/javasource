package loop;

import java.util.Scanner;

//문제: * 을 출력할 라인의 수 입력 받기 
public class ForEx10 {

    public static void main(String[] args) {

        for (int j = 5; j > 0; j--) {
            if (j > 1) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }

        System.out.println();
        for (int j = 5; j > 0; j--) {
            if (j > 2) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }

        System.out.println();
        for (int j = 5; j > 0; j--) {
            if (j > 3) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }

        System.out.println();
        for (int j = 5; j > 0; j--) {
            if (j > 4) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }

        System.out.println();
        for (int j = 5; j > 0; j--) {
            if (j > 5) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }

        System.out.println("\n\n");
        for (int i = 1; i < 6; i++) { // 1~5 값
            for (int j = 5; j > 0; j--) { // 5~1 값
                // // (1)if 방법
                // if (j > i) {
                // System.out.print(" ");
                // } else {
                // System.out.print("*");
                // }

                // // (2) 삼항 연산자
                System.out.print(j > i ? " " : "*");

            }
            System.out.println();
        }

    }

}
