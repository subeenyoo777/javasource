package ch6_oop.exrend;

public class Tv {
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
        return "Tv [channel=" + channel + ", power=" + power + "]";
    }

}
