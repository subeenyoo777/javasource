package api.string;

public class StringEx1 {

    public static void main(String[] args) {

        // 다 주소가 들어가있음
        String str1 = new String("안녕하세요");
        String str4 = new String("안녕하세요");

        String str2 = "안녕하세요"; // String은 이 방법을 더 많이 쓴다
        String str3 = "안녕하세요"; // 값이 같으니 str2를 사용함

        char[] charr = { 'H', 'e', 'l', 'l', 'o' };
        String str5 = new String(charr);
        System.out.println("str5 " + str5);

        System.out.println(str1 == str4); // false(각자 만들었기 때문)
        System.out.println(str2 == str3); // true( 재사용했기 때문)

        /// 문자열 비교 : equals()
        System.out.println(str1.equals(str3));

        str1 = "";// 빈 문자열 할당
        System.out.println(str1.length());

        str2 = null;
        System.out.println(str2.length());

    }
}
