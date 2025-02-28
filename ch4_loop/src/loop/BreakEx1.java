package loop;

public class BreakEx1 {
    public static void main(String[] args) {

        // 주제_break: swith, 반복문 중지(break 포함된 가장 가까운 반복문 탈출)

        // sum 값이 100보다 큰 경우 break
        // if 실행할 구문이 하나인 경우, {}생략가능
        // 여러줄은 안됨

        int sum = 0;
        int i = 0;

        while (true) {
            if (sum > 100)
                break;
            ++i;
            sum += i;
        }
        System.out.printf("i = %d, sum = %d", i, sum);
    }
}
