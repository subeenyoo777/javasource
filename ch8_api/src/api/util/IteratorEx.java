package api.util;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorEx {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("사과", "배", "수박", "포도");

        Iterator<String> iterator1 = list.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        System.out.println();

        Set<String> set = new HashSet<>(list);
        iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

    }
}
