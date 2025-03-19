package thread;

public class SmallLetters2 extends Thread {

    public SmallLetters2() {
        setName("smallletters2");
    }

    @Override
    public void run() {

        // 소문자 출력
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + "\t");
        }

    }

}
