package oop;

public class Tv2 {
    private int size;
    private String color;
    private int channel;
    private int volume;
    private boolean power;

    // 초기화 - 생성자
    public Tv2() {
    }

    public Tv2(int size, String color) {
        this.size = size;
        this.color = color;
    }

    void changeCannel(int channel) {
        this.channel = channel;
    }

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
