package op;

public class ArrthmeticsEx1 {
    public static void main(String[] args) {
        // 변수 선언 - int a(10), b(4)
        int a = 10, b = 4;
        // int a=10;
        // int b=4;

        // +, -, *, /(몫)
        System.out.printf("%d + %d = %d\n", a, b, a + b);
        System.out.printf("%d - %d = %d\n", a, b, a - b);
        System.out.printf("%d * %d = %d\n", a, b, a * b);
        System.out.printf("%d / %d = %d\n", a, b, a / b);
        // 소수점 float, double
        // a/(float)b == 10/4.000000
        // a(int) / b(float) : 타입이 다른 경우 연산 시 큰 쪽으로 변환
        System.out.printf("%d / %f = %f\n", a, (float) b, a / (float) b);
    }
}