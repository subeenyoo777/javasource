package api.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx2 {
    public static void main(String[] args) {

        List<Integer> lotto1 = new ArrayList<>();
        Set<Integer> lotto2 = new HashSet<>();

        // 6개 숫자 무작위 추출
        // for (int i = 0; i < 6; i++) {
        for (int i = 0; lotto2.size() < 6; i++) {
            // 로또 번호 1~45
            int num = (int) (Math.random() * 45) + 1;
            // lotto1.add(num);
            lotto2.add(num);

        }
        // System.out.println(lotto1);
        System.out.println(lotto2);

        // set => list 변경

        List<Integer> list = new ArrayList<>(lotto2);
        list.sort(Comparator.reverseOrder()); // 내림차순
        // list.sort(Comparator.naturalOrder()); // 오름차순
        System.out.println(list);

    }

}
