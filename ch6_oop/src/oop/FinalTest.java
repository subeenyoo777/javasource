package oop;

// 한 프로그램에서 클래스는 여러개 선언 가능하나, public은 하나만 선언가능

// public final class FinalTest {}

public class FinalTest {
    final int MAX_SIZE = 10;

    void getMaxSize() {
        // MAX_SIZE = 20;
        final int LV = MAX_SIZE;
        // LV = 20;
    }
}

class Test extends FinalTest {

}
