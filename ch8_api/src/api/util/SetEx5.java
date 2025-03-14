package api.util;

import java.util.TreeSet;

public class SetEx5 {
    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<>();// 기본적으로 정렬의 개념을 가지고 있음

        String from = "b", to = "d";

        set.add("abc");
        set.add("alien");
        set.add("bat");
        set.add("car");
        set.add("Car");
        set.add("dics");
        set.add("dance");
        set.add("dZZZZ");
        set.add("dzzzz");
        set.add("elephant");
        set.add("ekevator");
        set.add("fan");
        set.add("flower");

        System.out.println(set);

        // to 미포함.
        // 범위 검색.
        System.out.println(set.subSet(from, to));// [bat, car] b,c 로 시작
        System.out.println(set.subSet(from, to + "zzz"));// [bat, car, dZZZZ, dance, dics] b,c,..z전까지

    }
}
