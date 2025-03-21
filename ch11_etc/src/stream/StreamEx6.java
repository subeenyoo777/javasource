package stream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamEx6 {

        public static void main(String[] args) {

                IntStream stream = IntStream.rangeClosed(1, 10);

                // 2의 배수 개수
                long cnt = stream.filter(i -> i % 2 == 0).count();
                System.out.println("2의 배수 개수 : " + cnt);
                stream = IntStream.rangeClosed(1, 10);

                // 2의 배수 평균
                OptionalDouble d = stream.filter(i -> i % 2 == 0).average();
                System.out.println("2의 배수 평균 : " + d);
                stream = IntStream.rangeClosed(1, 10);

                // // 2의 배수 최대값
                OptionalInt opt = stream.filter(i -> i % 2 == 0).max();
                System.out.println("2의 배수 최대값 : " + opt);
                stream = IntStream.rangeClosed(1, 10);

                // // 2의 배수 최소값
                OptionalInt min = stream.filter(i -> i % 2 == 0).min();
                System.out.println("2의 배수 최솟값 : " + min);
                stream = IntStream.rangeClosed(1, 10);

                // // 2의 배수 합
                int sum = stream.filter(i -> i % 2 == 0).sum();
                System.out.println("2의 배수 합 : " + sum);
        }
}
