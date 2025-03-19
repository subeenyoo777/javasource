package thread;

public class SmallLetters implements Runnable {

    @Override
    public void run() {

        // 소문자 출력
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + "\t");
        }

    }

}
