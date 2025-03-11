package inter;

public interface RemoteControl {
    // 상수(final static), 추상 메서드(public abstract), default, static 메서드
    // final..생략가능

    int MAX_VOLUME = 10;
    final static int MIN_VOLUME = 0;

    // public abstract 붙지이 않아도 추상 메서드이다.
    void turnOn();

    void turnOff();

    void setVolume(int volume);

    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리합니다.");
        } else {
            System.out.println("무음 해제합니다");
        }
    }

    static void changeBattery(){
        System.out.println("배터리를 교체합니다.");        
    }


}
