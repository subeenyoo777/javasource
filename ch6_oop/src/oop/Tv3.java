package oop;

public class Tv3 {
    // private: 외부 클래스에서 접근 불가: 맴버변수
    // 특성에 관한 건 감추는 게 보통(내부에서만 쓰겠다).
    // <>public: private 반대(접근제한 없음): 생성자, 메서드

    private int size;
    private String color;
    private int channel;
    private int volume;
    private boolean power;

    // 초기화 - 생성자
    public Tv3() {
    }

    public Tv3(int size, String color) {
        this.size = size;
        this.color = color;
    }

    // setter(setSize~)
    // :인스턴스 변수의 값을 변경할 때
    // getter(getSize~)
    // : 인스턴스 변수 값을 사용하고 싶을 때

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // 불린 타입이기 때문에 is이다.
    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    // 동작)채널변경, 볼륨변경, 전원 크기, 끄기
    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }

    @Override
    public String toString() {
        return "Tv [size=" + size + ", color=" + color + ", channel=" + channel + ", volume=" + volume + ", power="
                + power + "]";
    }

}
