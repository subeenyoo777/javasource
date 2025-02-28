package loop;

public class ForEx13 {

    public static void main(String[] args) {
        // 문제: 1~100 사이 소수 구하기
        // 소수: 1과 자기 자신을 제외한 어떤 수로도 나누어 지지 않는다

        int cnt = 0; // 나누어 떨어지는 갯수를 세기 위함.

        for (int i = 2; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 2) {
                System.out.printf("%d ", i);
            }
            cnt = 0;
        }
    }
}
