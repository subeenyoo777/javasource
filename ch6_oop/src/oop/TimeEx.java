package oop;

public class TimeEx {

    public static void main(String[] args) {

        Time time = new Time();

        time.setHour(11);
        time.setMinute(60);
        time.setSecond(13.2f);

        // 대문자로 시작하는 경우 대개, static으로 선언한 것... 다 클래스!
        System.out.println("시:" + time.getHour());
        System.out.println("분:" + time.getMinute());
        System.out.println("초:" + time.getSecond());

        System.out.print("time");
        ;// 오버로딩
    }

}
