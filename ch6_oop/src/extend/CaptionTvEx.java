package extend;

public class CaptionTvEx {
    public static void main(String[] args) {
        // 부모 인스턴스 생성
        Tv tv = new Tv();

        // 자식 인스턴스 생성
        CaptionTv captionTv = new CaptionTv();
        captionTv.channel = 10;
        captionTv.channelUp();
        System.out.println("현재 채널:" + captionTv.channel);
        captionTv.displayCaption("Hello Java"); // 출력 안 나올 것
        captionTv.caption = true;
        captionTv.displayCaption("Hello java");
    }
}
