package ch1;

public class ScopeEx1 {
    public static void main(String[] args) {

        // 변수의 유효 범위
        // block 안에서 선언된 변수는 block 벗어난 곳에서는 사용 불가함.

        int a = 100;

        {
            int x = 10;
            System.out.println("x=" + x);
            System.out.println("a=" + a);

        }

        // x cannot be resolved to a variable
        // System.out.println("x=" + x);

        System.out.println("a=" + a);

        if (a < 200) {
            int sum = 0;
        }

        for (int i = 0; i < args.length; i++) {

        }

    }
}
