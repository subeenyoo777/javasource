package oop;

// static 메서드: 클래스 메서드
public class primitiveParmEx {
    public static void main(String[] args) {
        // main 메서드
        // void 반환, main 이름

        Data d = new Data();
        d.x = 100;
        System.out.println("main(): x = " + d.x);
        // (1)
        // change(d.x); // d.x 의 값만 넘어옴, 실행되는 곳이 다름.
        // 주소값을 알려줘야 값까지 바꿀 수 있다.

        // (2)
        change2(d);

        System.out.println("After change() ");
        System.out.println(d.x);
        // primitiveParmEx obj = new primitiveParmEx();// 내가 나를 불러
        // obj.change();
        // change 직접 부르지 못하는건 static 이기 때문.
    }

    static void change(int x) {
        x = 10000;
        System.out.println("change(): x = " + x);
    }

    static void change2(Data d) {
        d.x = 10000;
        System.out.println("change(): x = " + d.x);
    }

}
