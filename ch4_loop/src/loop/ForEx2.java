package loop;

public class ForEx2 {

    public static void main(String[] args) {

        // for (int i = 0; i < 5; i++) {
        // System.out.println(i); //0,1,2,3,4 출력
        // }

        // for (int i = 1; i < 11; i++) {
        // System.out.println(i); //1~11 출력
        // }

        // for (int i = 1; i < 11; i++) {
        // System.out.print(i+" "); //1~11 출력
        // }

        // for (int i = 10; i > 0; i--) {
        // System.out.print(i+" "); //10~1 출력
        // }

        // 짝수만 출력 1~10(1)
        // for (int i = 1; i < 11; i++) {
        // // i가 짝수이면 출력
        // if (i % 2 == 0) {
        // System.out.print(i + " "); // 10~1 출력
        // }

        // 짝수만 출력 1~10(2)
        for (int i = 2; i < 11; i += 2) { // i+=2 : i = i+2
            System.out.print(i + "   "); // 10~1 출력
        }

        // 1. 밖으로 빼도 된다
        // int i = 0
        // for (int j =0, k =1; args.length ; i++) { }//2. for 문 안에서 여러 변수 선언 가능함.

        // for (; ; ) {}//3. 아무것도 선언 안할 수도 있다.

    }
}
