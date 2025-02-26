package op;
public class ArrthmeticsEx2 {

    public static void main(String[] args) {

        //  +, -, *, /(몫만, 나머지는 없음)
        
        int a = 10, b=4;

        // shift+alt+↓
        System.out.printf("%d + %d = %d\n" ,a, b, a+b);
        System.out.printf("%d - %d = %d\n" ,a, b, a-b);
        System.out.printf("%d * %d = %d\n" ,a, b, a*b);
        System.out.printf("%d / %d = %d\n" ,a, b, a/b);
        // 소수점 float, double
        // a/(float)b) == 10/4.00000
        // a(int) / b(float) : 타입이 다른 경우 연산을 하게 되면 큰 쪽으로 변환이 일어난다.
        System.out.printf("%d / %f = %f\n", a, (float)b, a/(float)b);

      
       
        
    } 
}
