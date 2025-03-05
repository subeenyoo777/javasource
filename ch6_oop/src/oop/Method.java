package oop;

// 기능: 전화번호를 변경한다. 이메일을 변경한다. 학년을 변경한다. 반을 변경한다.
// 메서드: 리턴타입 메서드명 () {}
// 소문자로 시작.
// 리턴(반환) 타입: 기본 타입(정수형, booloean, 문자형, 실수형), 객체(대문자로 시작)타입, 배열, 
// void(리턴 타입 없음; return~ 안함)

public class Method {

    // 정수형
    int method1() {
        // return 0;
        int sum = 15;
        return sum;
    };

    String method2() {
        // return ""; //또는
        // return null;

        String str = "hello";
        return str;
    }

    // 실수형
    double method3() {
        return 35.5;
    }

    char method4() { // 문자 하나 타입
        return ' ';
    }

    void method5() {
        return; // void만 있으면 오류 안나나, 돌아가란 의미로 return 쓰기도. 필수 아님.
    }

    // 매개 변수(=전달인자/// 아래 괄호 같은 형태)가 있는 메서드
    // 매게 변수는 다 지역 변수다
    // 해석: 무언가 입력으로 값을 들어오고 > 더한 후에 > return한다.
    // 개수 상관없음. 타입 다양하게 들어올 수 있다.
    int add(int x, int y) {
        return x + y;
    }

    float add2(int x, float y) {
        // float + int --> 무조건 float
        // 타입일치시켜야 함. int로 하거나 아니면 선언에서 float하기
        return x + y;
    }

    // 입력은 없으나 return~처럼 출력은 없다.
    void print(String name, String id) {
        System.out.println(name + ":" + id);
    };

    int[] arr(int[] arr1) {
        return arr1;
    }
    // 반복작업하기 위해서 메서드를 만듦
}
