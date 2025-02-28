package loop;

public class ContinueEx1 {
    // 토픽_continue: 반복문에서만 사용.
    // 반복이 진행되는 도중에 continue를 만나면 반복문의 끝으로 이동하여

    // 다음 반복으로 넘어감.
    public static void main(String[] args) {

        for (int i = 0; i < 11; i++) {

            if (i % 3 == 0) // 3.6.9. 출력x
                continue;// 걸리면 다음으로 넘어가지 않고 돌아감.(몇줄 상관 x)
            System.out.println(i); // 이후의 있는 구문을 실행하지 않음.
        }

        // 1~10짝수(2.4.6.8.10)
        for (int i = 1; i < 11; i++) {
            if (i % 2 != 0)
                continue;
            System.out.println(i); // 이후의 있는 구문을 실행하지 않음.
        }

    }

}
