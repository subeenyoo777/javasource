package oop;

public class CardEx2 {
    public static void main(String[] args) {
        // Card에서 선언한 클래스 변수를 여기 불러서 선언함
        // 외부에서 클래스 변수를 사용할 때,
        // static으로 선언된 벼수와 메서드는 클래스이름.~으로 접근함.
        System.out.println("카드 너비" + Card.width);
        System.out.println("카드 높이" + Card.height);

        // 이와 대조적으로, 인스턴스 변수는 NEW card를 어디선가 해야 인스턴스가 생성된 것.
        // NEW 메모리(Heap)할당, 인스턴스 생성
        Card card = new Card();
        card.kind = "Heart";
        card.number = 7;

        Card card2 = new Card();
        card2.kind = "Spade";
        card2.number = 7;

    }
}
