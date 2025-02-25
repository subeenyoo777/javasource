package ch1;

// 형변환 (Casting)
// 변수 또는 상수의 타입을 다른 타입으로 변환하는 것
// char -> int, int -> char, float -> int, int -> float
// 작은 타입에서 큰 타입으로 형변환은 허용
// 큰 타입에서 작은 타입은 손실이 발생할 수 있기 때문에 강제 형변환

public class CastingEX1 {
    public static void main(String[] args) {
        // Example of explicit type casting
        double d = 85.4; // Corrected variable name
        System.out.println("d = " + d);

        // Casting double to int (will lose precision)
        int score = (int) d; // Explicit casting to int
        System.out.println("score = " + score); // Prints truncated value

        // Example of adding int and double (requires casting)
        int intValue = 10;
        double doubleValue = 5.5;

        // int + double => double, but casting to int for explicit precision loss
        double result = intValue + doubleValue; // No need for casting
        System.out.println("result = " + result); // Prints result of addition

        // Casting from double to float
        float f1 = 9.1234567f;
        double d1 = 9.1234567; // Corrected type to 'double'

        // Casting int to char
        int num = 97;  // Corrected syntax error (missing semicolon)
        char ch1 = (char) num; // Explicit casting from int to char
        System.out.println(ch1); // Prints 'a' because 97 is the ASCII code for 'a'
    }
}
