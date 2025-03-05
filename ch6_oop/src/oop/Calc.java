package oop;

public class Calc {
    // 사칙연산
    long add(long num1, long num2) {
        return num1 + num2;
    }

    long subtrack(long num1, long num2) {
        return num1 - num2;
    }

    long multiply(long num1, long num2) {
        return num1 * num2;
    }

    double divide(double num1, double num2) {
        return num1 / num2;
    }

    long max(long num1, long num2) {
        // if (num1 > num2) {
        // return num1;
        // } else {
        // return num2;
        // }
        return num1 > num2 ? num1 : num2;
    }

    long min(long num1, long num2) {
        // if (num1 > num2) {
        // return num2;
        // } else {
        // return num1;
        // }
        // 삼항연산자
        return num1 > num2 ? num2 : num1;
    }

}
