package array;

//배열
//: 같은 타임의 여러 변수를 하나의 묶음으로 다루는 개념.
//변수은 stack 공간
//배열은 heap 공간에 저장. 다른 공간

//배열의 크기는 변경이 불가능하다. ( = 새로 만들어서 옮기는 수밖에는 없다.)

public class ArrayEx1 {
    public static void main(String[] args) {

        // 학생 100명의 점수를 입력
        // int[] 배열명 = new int[100]; //배열 선언, 생성
        int[] scores = new int[5]; // [~] 처음에 생성할 때 공간을 잡으면, 나중에는 늘릴 수가 없다.
        // 배열을 다룰 때 중요한 부분

        // []배열명 , 배열명[] .... 괄호 위치 상관없음

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        int[] scores2 = { 85, 65, 95, 74, 100 }; // 배열은 연속적인 공간을 쓰며, 그때 index를 사용한다.

        // 세번째 학생 점수 출력 시 인덱스 -1
        System.out.println("세번째 학생: " + scores2[2]);
        // 배열의 길이 알고 싶을 땐, 배열명.length
        System.out.println("배열 길이: " + scores2.length);

        // 5번째 학생 점수 수정할 시
        scores2[4] = 98;
        System.out.println("다섯번째 학생: " + scores2[4]);

        // System.out.println(scores2[5]); Array Index Out Of Bounds Exception 왜? 4번까지만
        // 있기 때문.

    }
}
