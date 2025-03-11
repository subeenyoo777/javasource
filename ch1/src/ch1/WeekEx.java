package ch1;

import java.time.DayOfWeek;
import java.time.LocalDate;
// 컴퓨터는 숫자로 값을 다루고 인식함.

public class WeekEx {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println(now); // 2025-03-11

        // 요일에 따라 특정 숫자를 반환
        // 월(1) 화(1) 수(3) 목(4) 금(5) 토(6) 일(7)
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        System.out.println(dayOfWeek.getValue()); // 출력 : 2

        Week today = null;

        switch (dayOfWeek.getValue()) {
            case 1:
                today = Week.MONDAY;
                break;
            case 2:
                today = Week.TUESDAY;
                break;
            case 3:
                today = Week.WEDNESDAY;
                break;
            case 4:
                today = Week.THURSDAY;
                break;
            case 5:
                today = Week.FRIDAY;
                break;
            case 6:
                today = Week.SATURDAY;
                break;
            case 7:
                today = Week.SUNDAY;
                break;
            default:
                break;
        }

        System.out.println("오늘 요일은 : " + today);

        if (today == Week.SUNDAY) {
            System.out.println("게임을 합니다");
        } else {
            System.out.println("공부를 합니다");
        }

    }
}
