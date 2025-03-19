package lambda;

public class Lambda1 {

    int max(int a, int b) {
        return a > b ? a : b;
    }
    // (1)람다식 선언 방법(메서드명, 매게변수 타입, return...다 날림)
    // (a, b) -> a > b ? a : b;

    void print(String name, int i) {
        System.out.println(name + i);
    }
    // (2)람다식 선언 방법(메서드명, 변수 타입,...다 날림)
    // (name, i) -> System.out.println(name + i);

    int sumArr(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
    // (3)람다식 선언 방법(중간문 오면 리턴문 와야 함.)
    // (int[]arr) -> {
    // int sum = 0;
    // for (int i : arr) {
    // sum += i;
    // }
    // return sum;
    // }

}
