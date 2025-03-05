package oop;

// 같은 클래스 내에서 다른 메서드를 호출할 수 있다.(내꺼)
//호출 시 new~ 없이 그냥 부를 수 있다.

// 메서드 종류
// 1. 인스턴스 메서드: 클래스 영역 / 인스턴스가 생성되었을 때(new Card()), 
//                      static 안 붙을 경우 다 여기 해당
// 2. 클래스 메서드: 클래스 영역/클래스가 메모리에 올라갔을 때(클래스 작성 완료되면)
//static    붙음

// 같은 클래스 내에서 다른 메서드 호출 가능- 이름 사용
// static - non static 
//: (요점)만들어지는 시기가 다름. 그렇기에 생성되는 시기가 때문에 호출하는 시점을 따져야 함.

public class MiniCalc {

    // static 붙으면 무조건 클래스메서드
    static int k;
    int a, b;

    static void print() {
        // plus avg execute println.. 호출 불가 => new miniCalc() 한 후 생성!
        // ...자주 하지는 않는다.

        // this.a = 7; 호출하려면 , new miniCalc() 한 후
        k = 45;
    }

    int plus(int x, int y) {
        this.a = 7;
        k = 45;
        print();
        return x + y;
    }

    // 오 -> 왼으로 해석
    double avg(int x, int y) {
        double sum = plus(x, y);
        return sum / 2;
    }

    void execute() {
        double result = avg(7, 10);
        println("실행결과:" + result);
    }

    void println(String msg) {
        System.out.println(msg);
    }

}
// static 은 static 만 호출할 수 있다.
// non static: static, non static 사용가능
// (나중에 올라오기 때문)
