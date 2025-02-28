package loop;

import java.util.Scanner;

//문제: * 을 출력할 라인의 수 입력 받기 
public class ForEx9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("*을 출력할 라인의 수 입력하세요");
        int num = scanner.nextInt();

        // for (int i = 1; i < num+1; i++) {
        for (int i = 0; i < num; i++) {

            for (int j = 1; j <= i; j++) { // i가 1,2,3,4,5..변하는 값을 갖고 있다.
                System.out.print("*");
            }

            System.out.println();
        }
        scanner.close();// 열었으면, 닫아라!
    }
}
