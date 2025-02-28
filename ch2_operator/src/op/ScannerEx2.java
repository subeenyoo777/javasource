package op;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {

        // 키보드 입력 받기
        // system.in : 키보드, system.out: 화면

        // 기본적으로 사용자가 입력하는건 문자열이라고 인식.
        // 일단 무조건 문자로 받기 String input = scanner.nextLine(); "string 타입"

        Scanner scanner = new Scanner(System.in);

        System.err.print("정수 값 입력 >>"); // ln없애지 않으면 안됨.. // 뭘 하라고 입력하는 부분.

        // 입력 값은 숫자
        int input = scanner.nextInt(); // "int 타입"
        System.out.println(input);
        scanner.close();
    }
}

// 문자를 입력할 경우 뜨는 에러(Exception; 뜨는 경우 프로그램 멈춤)
// : Input Mismatch Exception
// Exception in thread "main" java.util.InputMismatchException
// at java.base/java.util.Scanner.throwFor(Scanner.java:939)
// at java.base/java.util.Scanner.next(Scanner.java:1594)
// at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
// at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
// at op.ScannerEx2.main(ScannerEx2.java:19)
// PS C:\sauce\javasource>
