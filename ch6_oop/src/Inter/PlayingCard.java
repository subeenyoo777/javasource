package Inter;

public interface PlayingCard {
    // 일반메서드 가질 수 없다
    // void pause(){}

    // 상수의 형태로만 가질 수 있다.
    // (상수는 대문자로 선언)
    // public static final.. 생략 가능
    public static final int SPADE = 4;
    int CLOVER = 4;

    // 맴버변수 가질 수 없음
    // boolean pause;

    // 추상 메서드만 가짐
    // * public abstract 생략가능
    void pause();

    // (JAVA 1.8ver~)
    // static, default 가 붙는다면 일반 메서드 허용함
    static void display() {
    }

    default void print() {
    }
}
