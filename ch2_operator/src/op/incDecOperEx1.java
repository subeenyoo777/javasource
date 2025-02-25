package op;

// 증감연산자 : +1, -1 간단하게 처리
// ++, -- : 변수 앞(전위), 변수 뒤(후위)
// 전위,후위든 단독으로 사용되는 경우는 결과과 동일하다
// 다른 수식에 초함되거나, 매서드의 매개변수에 사용되는 경우, 단독으로
// 사용되지 않은 경우는 결과가 다르다. 
// +num2 :

public class incDecOperEx1 {
    public static void main(String[] args) { 
        int num = 10;

        // num = num + 1;
        // num--;
        --num; // num을 1 감소시킴
        num = num + 1; // 1 증가시킴

        System.out.println("num = " + num); // 결과: 10

        int num2 = 20;
        System.out.println("num2 = " + (num2++)); // 후위 증감: num2 먼저 출력하고, 그 후에 증가 (출력값: 20)

        // 전위 증감 연산자 사용
        ++num2; // num2를 1 증가시킴
        System.out.println("num2 = " + num2); // 결과: 21
    }
}
