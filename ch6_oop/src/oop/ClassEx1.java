package oop;
// OOP(Object Oriented Programming)-객체지향

// 재사용성이 높다.
// 코드의 관리가 용이하다.
// 신뢰성이 높은 프로그램 작성

//클래스 : 객체 정의, 설계도, 틀
// 클래스 용도: 객체 생성

//객체: 사물(책상, 의자, 자동차, tv), 개념(수학공식)

//붕어빵 기계(클래스) - 붕어빵(객체)

//객체와 인스턴스
// 인스턴스: 어떤 클래스로부터 만들어진 객체.
// 객체는 다 만들어진 인스턴스를 통칭해서 부름. (책상은 책상  클래스의 인스턴스다)

// 객체는 어떻게 구성되어 있는가?? 

public class ClassEx1 {
    public static void main(String[] args) {
        // instance 생성
        // ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★기억해야 한다.
        // 클래스명 변수명 = new 클래스명();

        // new를 하는 순간 메모리에 계속 생성됨.

        Tv tv = new Tv();
        Tv tv2 = new Tv();

        // 속성확인
        // 주소가 아니라. 가리키는 곳의 맴버 변수를 알려주는 것."@Override public String toString()..
        System.out.println(tv);
        System.out.println(tv2);

        // 인스턴스 사용
        tv.color = "black";
        tv.channelUp();
        System.out.println("tv 현재채널 : " + tv.channel);
        System.out.println("tv 색상 : " + tv.color);

        // () 들어가있음 메소드.
        tv2.channelUp();// 메소드 호출(메소드 실행)
        tv2.channel = 8;
        tv2.volume = 22;
        System.out.println(tv2);

    }
}
