package api.util;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenEx {

    public static void main(String[] args) {

        String str = "this is a test";
        StringTokenizer st = new StringTokenizer(str); // 구분자 없다면 공백 기준으로 분리

        // split() : 배열로! String[]
        System.out.println("String split() : " + Arrays.toString(str.split(" ")));
        // 공백없음 = [t, h, i, s, , i, s, , a, , t, e, s, t]
        // 공백한칸 = [this, is, a, test]

        // 똑같음 st.hasMoreTokens() st.hasMoreElements()
        // : String
        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken() + "\t");
        }
        // print :
        // this
        // is
        // a
        // test

        str = "this/is/a/test";
        st = new StringTokenizer(str, "/");
        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken() + "\t");
        }

        String expression = "x=100*(200+300)/2";
        st = new StringTokenizer(expression, "+-/*=()", true);

        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken() + "\t");
        }
        System.out.println();

        // 1
        // 김천재
        // 100
        // 100
        // -----------
        // 2

        // st = new StringTokenizer(source, "|");
        // while (st.hasMoreTokens()) {
        // System.out.println(st.nextToken());
        // }

        String source = "1,김천재,100,100,100|2,박수재,95,80,90|3,이지바,80,90,90";

        st = new StringTokenizer(source, "|");
        while (st.hasMoreTokens()) {
            String token = st.nextToken();

            StringTokenizer st2 = new StringTokenizer(token, ",");
            while (st2.hasMoreTokens()) {

                System.out.println(st2.nextToken());

            }
            System.out.println("--------------------");

        }

        System.out.println();
    }
}
