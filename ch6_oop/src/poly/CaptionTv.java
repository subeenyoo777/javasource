package poly;

public class CaptionTv extends Tv2 {
    boolean caption;

    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}
