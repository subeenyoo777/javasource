package api.string;

public class StringBuilderEx1 {

    public static void main(String[] args) {

        String str1 = "안녕하세요";
        str1 += "반갑습니다.";
        str1 += "저는 홍길동입니다.";
        // String 은 원본 문자열을 변경할 수 없기 때문에
        // 매번 기존의 메모리를 해제하고 재생성하는 개념.

        // StringBuffer sb = ""; String과 다르게 직접 할당 안됨
        StringBuffer sb = new StringBuffer("안녕하세요");
        // sb.append("반갑습니다.");
        // sb.append("저는 홍길동입니다.");
        // ( = )
        sb.append("반갑습니다.").append("저는 홍길동입니다.");

        System.out.println(str1);
        System.out.println(sb);

        // String equals 확인
        String str2 = new String("Hello");
        String str3 = new String("Hello");

        System.out.println(str2.equals(str3) ? "문자열 같음" : "문자열 다름"); // 문자열 같음

        // StringBuffer equals 확인
        // : 부모가 상속해준 그대로 사용 중
        // 주소비교: object 넘겨준 대로 쓰고 있음 => 오버라이딩 안함
        StringBuffer sb1 = new StringBuffer("hello");
        StringBuffer sb2 = new StringBuffer("hello");
        System.out.println(sb1.equals(sb2) ? "문자열 같음" : "문자열 다름"); // 문자열 다름

        // String equals 사용하기 위해서 변환!
        // String obj1 = sb1.toString();
        // String obj2 = sb2.toString();
        // System.out.println(obj1.equals(obj2) ? "문자열 같음" : "문자열 다름");// 문자열 같음

        String obj1 = new String(sb1); // buffer A StringBuffer
        String obj2 = new String(sb2);
        System.out.println(obj1.equals(obj2) ? "문자열 같음" : "문자열 다름"); // 문자열 같음

        // str1 을 거꾸로 출력 : charAt() 인덱스를 거꾸로 지정
        // for .. length ... - 로 출력
        // 0부터 시작하고자 -1, 거꾸로 가고자 --
        for (int i = str1.length() - 1; i >= 0; i--) {
            System.out.print(str1.charAt(i));
        }
        System.out.println();

        // str1 StringBuffer 로 변경7
        // StringBuffer sb3 = new StringBuffer(str1);
        // System.out.println(sb3.reverse());
        // (=)
        System.out.println(new StringBuffer(str1).reverse());

        System.out.println("StringBuffer reverse()" + sb.reverse());

        // delete(start, end)
        System.out.println("sb1.delete(0,2)" + sb1.delete(0, 2));
        // llo
        System.out.println("sb1.delete(0,2)" + sb1.deleteCharAt(0));// lo
        System.out.println(sb1);

        // insert()
        System.out.println("sb1.insert(0, H)" + sb1.insert(0, "H")); // Hello

        // replace()
        System.out.println("sb1.replace(0,2,java)" + sb1.replace(0, 2, "java")); // sb1.replace(0,2,java)javallo
        System.out.println("원본 sb1" + sb1); // 원본 sb1javalo
    }

}
