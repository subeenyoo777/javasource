package lambda;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class LambdaEx {
    public static void main(String[] args) {

        // Lambda2 를 사용
        // ** 추상 메서드가 하나일 때만 사용 가능하다.
        // ▶1) 구현 클래스 작성 : class LambdaImpl implemnets Lambda2{}
        // ▶2)익명 구현 객체

        // Lambda2 obj = new Lambda2() {
        // @Override
        // public void method(){
        // }
        // };

        // ▶3)람다식으로 사용
        Lambda2 obj = () -> System.out.println("함수적 인터페이스 사용");
        obj.method();

        obj = () -> {
            int i = 100;
            System.out.println(i * i);
        };
        obj.method();

        // 중괄호 없는건 return 생략됨
        Lambda3 lambda3 = (a, b) -> a > b ? a : b;
        System.out.println("max " + lambda3.max(5, 3));

        // Math.random() : 1 ~6 리턴
        Supplier<Integer> supplier = () -> (int) (Math.random() * 6) + 1;
        System.out.println(supplier.get());

        IntSupplier intSupplier;

    }

}
