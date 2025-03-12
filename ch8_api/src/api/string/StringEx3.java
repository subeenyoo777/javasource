package api.string;

import java.util.Arrays;

public class StringEx3 {
    public static void main(String[] args) {
        String str = "hello";

        // 문자열 연결 : +
        str += "world";
        System.out.println(str);

        // concat() : 문자열을 뒤에 붙인다.
        String str2 = "안녕하세요 ";
        str2 = str2.concat("반갑습니다.");

        System.out.println(str2);

        // endwith(), startswith()
        System.out.println("지정된 문자열로 종료 여부" + str.endsWith("요"));
        System.out.println("지정된 문자열로 시작 여부" + str.startsWith("요"));

        String file = "test.txt";
        // 이미지 : png or gif or jpg
        if (file.endsWith("jpg") || file.endsWith("gif") || file.endsWith("jpg")) {
            System.out.println("이미지 파일입니다.");
        } else {
            System.out.println("이미지 파일이 아닙니다.");

            // replace(), replaceAll(), replaceFirst()

            // replace() 결과는 새로운 문자열로 반환.
            System.out.println("replace(old, new)" + str.replace("hello", "안녕하세요"));
            System.out.println(str); // helloworld, 원본 변경 불가

            // 원본 변경할 시
            str = str.replace("hello", "안녕하세요");
            System.out.println(str); // 담은 후에는 원본 변경됨.

            // replaceAll() : 일반문자뿐 아니라 정규식 사용 가능.
            System.out.println(str.replaceAll("[a-z]", "1"));
            // : a~z 소문자 찾아서 1로 바꿔줘 --> orld
            // print : 안녕하세요11111

            // replaceFrist() : 처음 만나는 거만 바꿔줘
            str2 = "hellollo";
            System.out.println(str2.replace("ll", "LL"));

            // subString() : 새로운 문자열 반환
            str2 = "java.lang.Object";
            System.out.println("특정 위치의 문자열 얻기" + str2.substring(10)); // print : object
            // 끝 위치는 포함하지 않음.
            System.out.println("특정 위치의 문자열 얻기" + str2.substring(5, 9)); // print : lang

            // split() : 특정 기호를 기준으로 자를 수 있음
            str2 = "dog,cat,bear";
            System.out.println("지정한 분리자로 나누어 배열로 변환" + Arrays.toString(str2.split(",")));

            String[] arr = str2.split(",", 2); // 지정된 숫자만큼만 잘라달라.

            for (String string : arr) {
                System.out.println(string);
            }
        }

        // 대문자 / 소문자로 변경하기
        str2 = "HELLO";
        System.out.println("소문자 변경" + str2.toLowerCase()); // 소문자 변경hello
        System.out.println("대문자 변경" + str2.toUpperCase()); // 대문자 변경HELLO

        // trim() : 양쪽 끝에 있는 공백 제거(가운데 안 함)
        // " Hello".equals("Hello") => false

        String str3 = "    Hello World    ";

        System.out.println(str3);
        System.out.println(str3.trim());// 공백이란 문자 제거함

        // valueOf() : 문자열(String)으로 변환, static method... 클래스로 시작
        int i = 5;
        String str4 = String.valueOf(i); // "5" 로 바꿔줌
        // (2) 아니면!
        str4 = i + ""; // "5"
    }
}
