package ch1;

public class VarFloatEx1 {
    public static void main(String[] args) {
        // 실수형 : float, double
        // 소수점 형태의 숫자를 사용하면 무조건 double 로 인식함
        // float(4byte) = double(8byte) ==> X
        // float 타입은 f, F 를 붙임
        float score1 = 90.14f;
        // double 타입도 d,D를 붙임
        double score2 = 98.5d;
        System.out.println("score1 = " + score1);
        System.out.println("score2 = " + score2);
        // 소수점 2째짜리까지 표현
        System.out.printf("score2 = %.2f\n", score2);
    }
}