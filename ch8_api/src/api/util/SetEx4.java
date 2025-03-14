package api.util;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx4 {

    public static void main(String[] args) {
        Set<Integer> lotto2 = new TreeSet<>();

        for (int i = 0; lotto2.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            lotto2.add(num);

        }
        // HashSet : [2, 6, 39, 7, 9, 11]
        // TreeSet : [6, 26, 30, 31, 33, 42] 정렬해줌.
        System.out.println(lotto2);

    }

}
