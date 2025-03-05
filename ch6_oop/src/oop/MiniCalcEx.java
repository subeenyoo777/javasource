package oop;

public class MiniCalcEx {
    public static void main(String[] args) {
        // ************************** 중요, 외우자**************************
        // print() 메서드 호출
        // 클래스 메서드이기 때문에 객체 생성없이 '클래스 이름.' 으로 호출가능
        MiniCalc.print();
        System.out.println(MiniCalc.k);

        // 외부에서 호출할 때
        // execute() 호출
        MiniCalc calc = new MiniCalc();
        calc.execute();
        calc.a = 7;

    }
}
