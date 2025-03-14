package api.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx2 {

    public static void main(String[] args) {

        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("hong11", "홍길동"));
        map.put(1, new Person("hong12", "강길동"));
        map.put(1, new Person("hong13", "최길동"));
        map.put(1, new Person("hong11", "홍길동"));

        Set<Integer> set = map.keySet();
        Iterator<Integer> iter = set.iterator();

        while (iter.hasNext()) {
            Integer key = iter.next();
            Person p = map.get(key);
            System.out.println(p);
        }
    }
}
