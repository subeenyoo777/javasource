package Inter;

// extends : 확장
// implement : 구현

//  implement -> 인터페이스. (일반 클래스x) 
public class Card implements PlayingCard {

    @Override
    public void pause() {
        throw new UnsupportedOperationException("Unimplemented method 'pause'");
    }

}
