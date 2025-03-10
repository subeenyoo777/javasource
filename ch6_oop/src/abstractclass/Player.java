package abstractclass;

//추상 클래스
public abstract class Player {
    boolean pause;
    int currentPos;

    // 생성자
    Player() {
        pause = false;
        currentPos = 0;
    }

    // 추상 메서드/하나라도 가지고 있으면 추상 클래스를 선언해야 한다
    abstract void play();

    // 일반 메서드
    void pause() {
    }
}

// 일반 클래스에서 오버라이드는 선택사항
// (부모가 내려준 걸 안쓸 때)
// <>abstract에서 오버라이드는 강제사항.
class CDPlayer extends Player {

    // CDPlayer메세드 안에 super()숨어져 있음

    // 자식 클래스에서 play를 만들도록 강제시킴
    @Override
    void play() {
        System.out.println("CD 플레이어");
    }
}

class AudioPlayer extends Player {
    @Override
    void play() {
        System.out.println("Audio 플레이어");
    }

}
