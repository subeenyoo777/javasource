package api.string;

import java.util.Arrays;

public class StringEx2 {
    public static void main(String[] args) {

        String str = "안녕하세요";
        System.out.println("문자열 길이" + str.length());

        System.out.println("\n");

        // 문자열 길이
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        System.out.println("\n");
        // System.out.println("지정된 위치에 있는 문자 반환 " + str.charAt(0));
        // System.out.println("지정된 위치에 있는 문자 반환 " + str.charAt(1));
        // System.out.println("지정된 위치에 있는 문자 반환 " + str.charAt(2));
        // System.out.println("지정된 위치에 있는 문자 반환 " + str.charAt(3));
        // System.out.println("지정된 위치에 있는 문자 반환 " + str.charAt(4));

        // char 배열로 변환 ['안', '녕'... ]
        // char[] charr = { '안', '녕', '하', '세', '요' };
        char[] chArr = new char[str.length()];

        for (int i = 0; i < chArr.length; i++) {

            chArr[i] = str.charAt(i);
        }
        System.out.println("chArr" + Arrays.toString(chArr));

        // String => char 배열
        char[] result = str.toCharArray();

        // 존재하면 인덱스 반환
        System.out.println("주어진 문자가 문자열에 존재하는지 여부" + str.indexOf("안")); // 0 존재
        System.out.println("주어진 문자가 문자열에 존재하는지 여부" + str.indexOf("반")); // -1 존재x

        // indexOf 를 이용한 T / F
        // 자바 문자가 있으면 "자바와 관련 있는 책입니다."
        // ----------->없으면 "자바와 관련 없는 책입니다."

        String subject = "자바의 정석";
        System.out.println(subject.indexOf("자바")); // 0

        System.out.println(subject.indexOf("자바"));

        if (subject.indexOf("자바") >= 0) {
            System.out.println("자바와 관련 있는 책입니다");
        } else {
            System.out.println("자바와 관련 없는 책입니다.");
        }

        // contains 를 이용한 T / F ..> 이게 더 편함.
        // 왜? 리턴타입이 boolean
        if (subject.contains("자바")) {
            System.out.println("자바와 관련 있는 책입니다");
        } else {
            System.out.println("자바와 관련 없는 책입니다.");
        }

        // 찾기 시작하는 위치 지정 가능
        System.out.println("찾는 시작 위치 지정" + str.indexOf("하", 4));
        System.out.println("문자열의 오른쪽 끝부터 찾기 " + str.lastIndexOf("하"));

        String str2 = "java.lang.Strijg";
        System.out.println(str2.indexOf(".")); // 왼쪽에서 처음 찾은 위치 알려줌
        System.out.println(str2.indexOf(".", 5)); // 5부터 시작해 찾아!
        System.out.println(str2.lastIndexOf(".")); // 오른쪽에서 처음 찾은 위치
    }
}
