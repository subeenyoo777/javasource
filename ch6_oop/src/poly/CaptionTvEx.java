package poly;

public class CaptionTvEx {
    // 조상 타입의 참조 변수로 자식 인스턴스 참조
    public static void main(String[] args) {
        // 부모 인스턴스 생성
        Tv2 tv = new CaptionTv();

        tv.channel = 10;
        tv.channelUp();
        System.out.println("현재 채널:" + tv.channel);

        // 캐스팅을 통해 자손의 멤버에 접근한다.
        CaptionTv ctv = (CaptionTv) tv;

        ctv.displayCaption("Hello Java");
        ctv.caption = true;
        ctv.displayCaption("Hello Java");
        // 조상 타입의 참조 변수를 자손 클래스의 인스턴스를 참조한다.

        // Tv.displayCaption("Hello Java"); // 출력 안 나올 것
        // Tv.caption = true;
        // Tv.displayCaption("Hello java");
    }
}
