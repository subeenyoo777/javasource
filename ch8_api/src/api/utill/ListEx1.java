package api.utill;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {

    public static void main(String[] args) {

        // list는 배열!, 공간을 넉넉히 잡기.
        List<Integer> list = new ArrayList<>();

        // arr[0] = 3;
        // 추가
        list.add(15);
        list.add(25);
        list.add(35);
        list.add(45);
        list.add(55);

        list.add(3, 75);

        System.out.println(list);
        // [15, 25, 35, 45, 55]

        // 조회
        System.out.println("특정 위치 요소 조회" + list.get(3));
        System.out.println("특정 위치 요소 제거" + list.remove(0));
        System.out.println("특정 요소 제거" + list.remove(Integer.valueOf(35)));

        System.out.println(list);
    }

}
