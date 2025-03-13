package api.wrapper;

public class WrapperEx {
    public static void main(String[] args) {
        Integer i = 10; // 메소드... 등 불러쓸 수 있다 <> int i.. 할 수 없음

        System.out.println("String 숫자 => int 변환" + Integer.parseInt("10"));

        // i를 문자로 바꾸는 것
        System.out.println("int => String 숫자 변환" + i.toString());

        System.out.println("(5, 8) max" + Integer.max(5, 8));
        System.out.println("(5, 8) min" + Integer.min(5, 8));

        // int ==> Integer
        // Integer ==> int
    }
}
