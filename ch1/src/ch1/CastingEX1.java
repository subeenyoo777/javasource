package ch1;

// 형변환 (Casting)
// 변수 또는 상수의 타입을 다른 타입으로 변환하는 것
// char -> int, int -> char, float -> int, int -> float
// 작은 타입에서 큰 타입으로 형변환은 허용
// 큰 타입에서 작은 타입은 손실이 발생할 수 있기 때문에 강제 형변환

public class CastingEX1 {
    public static void main(String[] args) {
        // Example of explicit type casting
        double d = 85.4; // Fixed the typo (doubled to double)
        System.out.println("d = " + d);

        // Casting double to int (will lose precision)
        int score = (int) d; // Explicit casting to int
        System.out.println("score = " + score); // Fixed typo in print statement

        // Example of adding int and double (requires casting)
        int intValue = 10;
        double doubleValue = 5.5;

        // int + double => double
        int rresult = intValue + (int)dblValue;
        System.out.printf(format: "result = %d\n",result);

        float f1 = 9.1234567f;
        doubled d1 = 9.1234567;
            
        })
        
        // Explicit casting to avoid error (int + double results in double)
        // 작타입은 큰 타입으로 알아서 변환
    double result = intValue + doubleValue; // No need for casting, this is valid
        System.out.println("result = " + result); // Prints result of addition
    }
}
int num = 97:
char ch1 = (char)num;
System.out.println(ch1);