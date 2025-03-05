package oop;

public class Triangle {
    // 삼각형 클래스
    // 속성: 밑변(baseLine), 높이(height) ->int 타입

    int baseLine, height;

    public Triangle() {
    }

    // 생성자 목적
    // 1. 인스턴스 변수 초기화(무조건 자바에 있어야 함.)

    public Triangle(int baseLine, int height) {

        this.baseLine = baseLine;
        this.height = height;
    }

    // 기능: 면적을 구한다. -> double 타입, getARea()
    double getArea() {
        return baseLine * height / 2.0; // 2 정수로, 2.0 은 더블로 인식.
    };

}
