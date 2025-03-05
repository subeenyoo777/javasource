package oop;

public class Square {
    // 정사각형 클래스

    int sideLength;// 길이

    public Square() {
    }

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    // 속성: 길이(sideLength)
    // 기능: 면적 구하기
    int getArea() {
        return sideLength * sideLength;
    }

    // 생성자, ,to String
    @Override
    public String toString() {
        return "Square [sideLength=" + sideLength + "]";
    }

}
