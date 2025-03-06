package oop;

// static 메서드: 클래스 메서드
public class primitiveParmEx { // primitiveParmEx(클래스명)
    public static void main(String[] args) {
        // main 메서드
        // void 반환, main 이름

        Data d = new Data();// Data 클래스의 Data객체 만듦.
        d.x = 100; // d 객체의 필드인 x에 100 값을 할당.
        System.out.println("main(): x = " + d.x);

        // (1)값 복사
        change(d.x); // d.x 의 값만 넘어옴, 실행되는 곳이 다름.
        // main에서 d.x는 변하지 않는다.
        // 주소값을 알려줘야 값까지 바꿀 수 있다.

        // (2)주소 복사 d(0x00..이런 식으로 )
        change2(d);// change2메서드는 Data 객체 d를 참조로 전달받는다.
                   // ( -> 메서드 안에서 객체의 필드 d를 수정 가능)

        System.out.println("After change() ");
        System.out.println(d.x);

        // primitiveParmEx obj = new primitiveParmEx();// 자신을 새로 생성하여 메서드 호출
        // obj.change();
        // change 직접 부르지 못하는건 static 이기 때문.
        // static 메서드는 객체를 생성하지 않고 직접 호출해야 함.
    }

    // (1)값에 의한 전달
    static void change(int x) {
        x = 10000; // x 에 10,000 할당
        System.out.println("change(): x = " + x);
    }

    // (2)참조에 의한 전달(메서드 안에서 객체의 속성 즉 필드 수정 가능)
    static void change2(Data d) {
        d.x = 10000; // d 객체의 x 필드를 10,000 으로 수정
        System.out.println("change(): x = " + d.x); // 수정된 x 출력
    }

}
