package oop;
//main 없는 클래스! ver.

// Tv 클래스를 이용해서 Tv(인스턴스)를 생성

// 객체의 구성요소
// 1. 속성 => 맴버 변수
// 2. 기능 => 맴버 메서드
// (클래스 내에 선언한 것들은 다 '맴버'변수라고 부른다)

// ★★★★★★★★★클래스 생성함. main 없음★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
public class Tv {
    // Tv 살 때의 고려요소(속성): 크기(int), 색상(String), 채널(int), 볼륨(int)
    // 클래스 열자마자 선언했기에 맴버 변수이다.(일반 변수 x)
    int size;
    String color;
    int channel;
    int volume;
    boolean power;

    // 동작)채널변경, 볼륨변경, 전원 크기, 끄기
    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }

    void power() {
        power = !power; // true 담겨짐
    }

    @Override
    public String toString() {
        return "Tv [size=" + size + ", color=" + color + ", channel=" + channel + ", volume=" + volume + ", power="
                + power + "]";
    }

}
