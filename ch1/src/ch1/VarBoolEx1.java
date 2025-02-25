package ch1;

public class VarBoolEx1 {
    public static void main(String[] args) {
        // boolean: true, false 두 가지 값만 표현 가능
        boolean flag = true;
        
        // Printing using println
        System.out.println("flag = " + flag); // Fixed the semicolon issue

        // Printing using printf
        System.out.printf("flag = %b\n", flag); // Fixed printf syntax
    }
}

