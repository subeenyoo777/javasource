package loop;

//반복문 - for ~ while(가장 많이 씀), do~while
//반복적으로 실행해야 되는 코드를 간단하게 처리.

//안녕하세요 10번 출력

public class ForEx1 {

    public static void main(String[] args) {

        // 반복문은 강제 중단(break)) 또는 조건 false 될 때_중단됨.

        // 1) int i = 0; (초기화 단계, 한번만 실행)
        // 2) 조건 검사 i < 5;
        // 3)loop 안으로 진입 - 안녕하세요 출력
        // 4)증감 연산자를 실행 i++ (i =1)

        // 5)조건 검사를 한다.
        // 6) lioop 안으로 진입 - 안녕하세요 출력
        // 7)증감 연산자 실행 i++ (i=2)
        // 8) 5~7 반복
        //....증감 연산자 실행 i++( i =5)
        //....조건 검사 5<5 루프 중단

        for (int i = 0; i < 5; i++) {
            System.out.println("안녕하세요");
        }

    }

}
