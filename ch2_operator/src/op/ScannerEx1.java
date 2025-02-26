package op;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {

        //키보드 입력 받기
        //system.in : 키보드, system.out: 화면

        Scanner scanner = new Scanner(System.in);
       // 사용자가 입력한 값을 input 변수에 담기
       // nextLine() : 문자열로 받아옴.
        System.out.println("두자리 정수 입력");

        String input = scanner.nextLine();//"45" 값을 받은 것.

        int num = Integer.parseInt(input);
        System.out.println("입력값 : " + num);

        scanner.close();
    }
}