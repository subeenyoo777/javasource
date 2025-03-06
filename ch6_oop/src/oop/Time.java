package oop;

public class Time {
    // 속성: 시, 분, 초

    private int hour;
    private int minute;
    private float second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        // 입력값 hour가 1~23 사이에 있다면 세팅
        // 없으면 return.
        if (hour < 0 || hour > 23)
            return;
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59)
            return;
        this.minute = minute;
    }

    public float getSecond() {
        return second;
    }

    public void setSecond(float second) {
        if (second < 0.0f || minute > 59.99f)
            return;
        this.second = second;
    }

}
