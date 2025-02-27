package loop;

public class ForEx3 {

    public static void main(String[] args) {

        // // 1~10까지의 합
        // int sum = 0;

        // for (int i = 1; i < 11; i++) {
        //     sum += i; // sum = sum + i;
        // }
        // System.out.println("1~10까지의 합" + sum);


//1~100까지 수 중에서 3의 배수 출력
        int sum2 = 0;
        for (int i = 1; i < 101; i++) {
         
            if (i % 3 == 0){
                System.out.print(i + "\t");   // \t 공백임.
            }
         
        }
        System.out.println(sum2);


    }

}
