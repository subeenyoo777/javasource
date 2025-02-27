package loop;

public class ForEx5 {

    public static void main(String[] args) {

        int sum = 0; // 합은 변수를 for 밖에서.
        // 1)3의 배수의 총합 출력(1~100)
        for (int i = 1; i < 101; i++) {

            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("3배수의 합" + sum);

        // //2)3의 배수는 더하고, 9의 배수는 뺀 합을 출력
        sum = 0; 
        for (int i = 1; i < 101; i++) {

            if (i % 3 == 0 && i % 9 != 0 ) {
                sum += i;
            }
        }
        System.out.println("3의 배수,9의 배수 아닌 수의 합" + sum);


        // //3)3의 배수와(or) 5의 배수의 총합 출력
        sum = 0; 
        for (int i = 1; i < 101; i++) {

            if (i % 3 == 0 || i % 5 == 0 ) {
                sum += i;
            }
        }
        System.out.println("3배수,5의 배수의 총합" + sum);

    }

}
