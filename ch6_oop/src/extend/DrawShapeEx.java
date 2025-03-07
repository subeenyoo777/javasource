package extend;

public class DrawShapeEx {
    public static void main(String[] args) {

        // 방법1
        // Point[] p = new Point[3];
        // p[0] = new Point(100, 100);
        // p[1] = new Point(140, 50);
        // p[2] = new Point(200, 100);

        // 방법2
        Point[] p = { new Point(200, 100), new Point(140, 50), new Point(200, 100) };
        Triangle triangle = new Triangle(p);
        triangle.draw();// 삼각형 그리기

        // 방법-1 (p1 쓰지 않을거라면 2번으로)
        // Point p1 = new Point(150, 150);// 객체는 new 해야 한다.
        // Circle c = new Circle(p1, 0);
        // 방법-2
        Circle c = new Circle(new Point(150, 150), 150);
        c.draw();// 삼각형 그리기
    }
}
