package ch1;

public class VarcharEX1U {
    public static void main(String[] args) {
        // answk : 글자 한개 => 'a','미',''
        // 문자열 : 글잔 한개 ~ 여러개 => "미","a","abc","대한민국",""

        // 기라는 문자를 ch1 에 대입
        char ch1 = '기';

        // ch1의 값을 unicode 변수에 대입
        // int = char
        int unicode = ch1;
        System.out.println("ch1 = " + ch1);
        System.out.println("unicode = " + unicode);

        char ch2 = 'a';
        unicode = ch2;
        System.out.println("ch2 = " + ch2);
        System.out.println("unicode = " + unicode); //97

        char ch3 = 'A';
        unicode = ch3;
        System.out.println("ch3 = " + ch3);
        System.out.println("unicode = " + unicode); //65
    }

    public static void main2(String[] args) {
        // boolean : true, false 두 가지 값만 가능
        boolean flag = true;
        System.err.println("flag = " + flag);
    }
}
