package op;

import java.util.Scanner;

public class LogicalEx2 {
        //"abc" => "abc".charAt(0) : a, "abc".charAt(1):b
        //charAt(index): 문자열을 문자로 분해해서 돌려받은 메소드이다
        //index는 0번부터 시작.
        //true && true ==> true
        //true || false ==> true ( 둘 다 true 여야 true)
        //true && true ==> true (둘중에 하나만 true라면 결과값은 true)
        //!true ==> false
        //!false ==> true

    public static void main(String[] args) {
        
        //사용자로부터 문자를 입력받은 후 
        //그 문자가 숫자인지 아니면 영문자인지 판별하는 프로그램

        Scanner scanner = new Scanner(System.in);
        System.out.println("문자를 하나 입력하세요");

        String input = scanner.nextLine();

        char ch = input.charAt(0);

        if ('0' <= ch && ch <= '9') {                         //해당 조건이 사실이라면 //실행을 해달라
        System.out.println("입력하신 문자는 숫자입니다");
        }

        if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
            System.out.println("입력하신 문자는 영문자입니다");
        }
    
    scanner.close();
    }
    
}


