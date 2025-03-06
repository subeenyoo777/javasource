package op;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {

        // 키보드 입력 받기
        // system.in : 키보드, system.out: 화면

        Scanner scanner = new Scanner(System.in);

        System.out.println("두자리 정수 입력");
        // 사용자가 입력한 값을 input 변수에 담기
        // nextLine() : 문자열로 받아옴.
        String input = scanner.nextLine();// "45" 값을 받은 것.

        // "45" ==> 45
        int num = Integer.parseInt(input);
        System.out.println("입력값 : " + num);

        scanner.close();
    }
}

// 문자를 입력할 때 뜨는 Exception 에러
// : Number Format Exception/에러난 위치 (ScannerEx1.java:18)

// Exception in thread "main" java.lang.NumberFormatException: For input string:
// "문자"
// at
// java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
// at java.base/java.lang.Integer.parseInt(Integer.java:668)
// at java.base/java.lang.Integer.parseInt(Integer.java:786)
// at op.ScannerEx1.main(ScannerEx1.java:18)
// PS C:\sauce\javasource>