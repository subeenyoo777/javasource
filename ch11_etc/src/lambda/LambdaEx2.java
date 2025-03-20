package lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx2 {
    public static void main(String[] args) {
        // void accept(T t);
        // 숫자를 전달인자로 받아 출력하기
        Consumer<Integer> consumer = (i) -> System.out.println(i);
        consumer.accept(50);

        // 문자를 전달인자로 받아 출력
        Consumer<String> consumer2 = (str) -> System.out.println(str);
        consumer2.accept("안녕하세요");

        BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t + u);
        biConsumer.accept("hello ", "world");

        // 타입을 기본으로 Double 정함.
        DoubleConsumer doubleConsumer = (d) -> System.out.println(d);
        doubleConsumer.accept(15.5);

        // 그 외 LongConsumer, IntConsumer
        // (T t, double value);
        ObjDoubleConsumer<String> objDoubleConsumer = (t, value) -> System.out.println(t + "" + value);
        objDoubleConsumer.accept("안녕하세요 ", 8.7);

        // Math.random() : 1 ~6 리턴
        Supplier<Integer> supplier = () -> (int) (Math.random() * 6) + 1;
        System.out.println(supplier.get());

        IntSupplier intSupplier = () -> (int) (Math.random() * 6) + 1;
        System.out.println(intSupplier.getAsInt());

        // 전달인자로 받은 문자열의 길이가 0인지 테스트한 후 0인 경우 빈문자열입니다 출력
        Predicate<String> predicate = (str) -> str.length() == 0;
        if (predicate.test(""))
            System.out.println("빈 문자열입니다.");

        // 전달인자로 받은 숫자가 짝수인지 테스트한 후 짝수라면
        // 짝수입니다. 아닌 경우 홀수입니다
        Predicate<Integer> predicate2 = (i) -> i % 2 == 0;
        if (predicate2.test(5)) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }

        // T : type, R: return type
        // 숫자를 문자로 반환
        Function<Integer, String> f = (i) -> String.valueOf(i);
        System.out.println(f.apply(35));

        // 사칙연산
        BiFunction<Integer, Integer, Integer> f2 = (x, y) -> x + y;
        System.out.println(f2.apply(5, 4));

        f2 = (x, y) -> x * y;
        System.out.println(f2.apply(5, 4));
        f2 = (x, y) -> x - y;
        System.out.println(f2.apply(5, 4));

    }
}
