package api.util;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {
    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();

        set1.add("사과");
        set1.add("바나나");
        set1.add("수박");
        set1.add("자몽");
        set1.add("포도");
        set1.add("감");
        set1.add("귤");

        System.out.println(set1);

        String str1 = "사과";
        String str2 = "사과";
        String str3 = new String("사과");

        // 같은 문자 - 1573328 동일한 값 나옴.
        System.out.println("str1.hashCode()" + str1.hashCode());
        System.out.println("str2.hashCode()" + str2.hashCode());
        System.out.println("str3.hashCode()" + str3.hashCode());

    }
}
