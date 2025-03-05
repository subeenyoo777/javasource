package oop;

public class CalcEx {

    // 인스턴스 생성부르자.
    public static void main(String[] args) {

        Calc calc = new Calc();

        // teturn 타입이 있다면(voide 제외)
        // 1)변수에 담기
        // 2)출력문 사용

        int num1 = 45, num2 = 15;

        // (1) 가공 또 하려고 할 때
        // 작은 거가 큰 걸로 담을 때 자동 형변환이 일어난다. <>casting
        // double > long > int 순으로 크다.
        long result = calc.add(45, 15);

        // (2) 결과만 보고 싶을 때 안에 직접 넣는다.
        System.out.printf("%d + %d = %d\n", num1, num2, calc.add(num1, num2));
        System.out.printf("%d - %d = %d\n", num1, num2, calc.subtrack(num1, num2));
        System.out.printf("%d * %d = %d\n", num1, num2, calc.multiply(num1, num2));
        System.out.printf("%d / %d = %.2f\n", num1, num2, calc.divide(num1, num2));

        double d1 = 35.5, d2 = 10;
        System.out.printf("%f / %f = %.2f\n", d1, d2, calc.divide(d1, d2));

        System.out.printf("%d, %d 큰 수 : , %d\n", num1, num2, calc.max(num1, num2));
        System.out.printf("%d, %d 작은 수 : , %d\n", num1, num2, calc.min(num1, num2));
    }
}
