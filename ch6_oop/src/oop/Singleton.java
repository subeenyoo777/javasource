package oop;

public class Singleton {
    // static 하나만 만들어서 공유해 씀.
    private static Singleton singleton = new Singleton();

    // 생성자
    // private: 외부에서 사용 불가.
    private Singleton() {
    }

    static Singleton getInsatace() {
        return singleton;
    }

}

// Singleton
// :객체를 하나만 만들어서 사용하는 것