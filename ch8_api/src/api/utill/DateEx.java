package api.utill;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateEx {

    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        // yyyy : 연도 4자리, yy : 년도 2자리
        // MM : 월 2, 1~9 월 01
        // dd : 일 2
        // hh : 시
        // mm : 분
        // ss : 초
        // a : AM/PM

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(d));

        sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(sdf.format(d));

        sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
        System.out.println(sdf.format(d));

        sdf = new SimpleDateFormat("오늘은 E 요일");
        System.out.println(sdf.format(d));

    }

}

// Thu Mar 13 13:15:56 KST 2025
// 2025-15-13
// 2025-15-13 01:15:56
// 2025-15-13 오후 01:15:56
// 오늘은 목 요일