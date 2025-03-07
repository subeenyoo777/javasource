package oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import extend.Parent;
import static java.lang.Math.*;
//math 안에 다 static이기 때문에 가능
//Math.min.. 에서 Math 생략 가능해진다!

//import구문을 사용하지 않는 패키지(import 자동으로 처리)
// : java.lang.*  (lang 패키지에 속하는 모든(*) 클래스)

//import 구문
//: 다른 패키지의 클래스 사용할 때
public class ImportEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Parent parent = new Parent();

        Date date = new Date();
        System.out.println(date); // Fri Mar 07 16:41:06 KST 2025

        // 클래스명---------------->클래스명과 같은 생성자...생서자 오버로딩
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("오늘 날짜는:" + sdf.format(date));

        // math : static 메서드로 선언됨
        // import 구문이 들어오지 않음.
        // System.out.println(Math.min(15, 25));// java.lang.Math 에 있음

        // ↓static 타입의 import를 선언한 후
        System.out.println(min(15, 25));
        System.out.println(random());

        // 클래스명
        String str; // java.lang.String 소속

    }
}
