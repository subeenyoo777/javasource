package extend;
// 클래스간의 관계

// 1)상속관계: isa
// 2)포함관계: hasa
// 한 클래스 안에 다른 클래스가 맴버 변수로 선언

//관계 결정하는 법
// public class Circle extends Point{}..X
// = circle은 point이다.(is관계_Circle is a Point)
// 포함:circle은 point를 가지고 있다.(has관계_circle has a Point)

//예) Car, SportsCar
// SportsCar는 Car이다 or SportsCar는 Car를 가지고 있다.(1)-->is 관계

public class Circle extends Shape {

    // int x, y; 필요없음
    Point point;
    int r;

    String name;// 대문자로 시작하면 다 객체,클래스.. 포함관계

    public Circle() {
    }

    public Circle(Point point, int r) {
        this.point = point;
        this.r = r;
    }

    // 오버라이딩
    // :자식 클래스에서 부모 클래스의 메서드를 재정의
    void draw() {
        System.out.printf("[center = (%d, %d), r =%d, color = %s]\n",
                point.x, point.y, r, color);
    };

}
