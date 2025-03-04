package array;

import java.util.Scanner;

public class ArrayEx16 {
    public static void main(String[] args) {

        String[][] words = {
                { "chair", "의자" },
                { "computer", "컴퓨터" },
                { "integer", "정수" }
        };

        Scanner sc = new Scanner(System.in);

        // Q1. chair의 뜻은? 의자
        // words[0][1]
        // 정답입니다.
        // words[0][1].equals(사용자 입력값)
        // Q1. computer 뜻은? 의지
        // words[1][0]
        // 틀렸습니다. 정답은 컴퓨터입니다.

        System.out.println(words[0].length);
        System.out.println(words[1].length);
        System.out.println(words[2].length);

        for (int i = 0; i < words.length; i++) {
            System.out.printf("Q%d. %s 의 뜻은? ", i + 1, words[i][0]);

            // 사용자 입력
            String input = sc.nextLine();

            if (input.equals(words[i][1])) {
                System.out.printf("정답입니다");
            } else {
                System.out.printf("틀렸습니다. 정답은 %s 입니다. \n", words[i][1]);
            }
        }

    }

}
