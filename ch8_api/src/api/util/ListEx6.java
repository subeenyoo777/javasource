package api.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ListEx6 {

    public static void main(String[] args) {
        // 한 어린이의 키를 2015~2024년 사이에 1년 단위로 입력받기
        // 입력받은 데이터는 ArrayList에 저장한다. 가장 키가 많이 자란 연도 출력
        // 입력 예시 : 120 122 125 130 139 160 169 173 175

        // split 은 배열로 들어옴. 배열은 ArrayList로
        // StringTokenizer 써서 List 쓰기

        Scanner sc = new Scanner(System.in);
        System.out.println("10년 동안의 키를 입력해 주세요");
        System.out.println(" >> ");
        String input = sc.nextLine();

        // ArrayList에 키 값 저장
        // 이 구문이 그래서 뭔데??
        List<Integer> list = new ArrayList<>();

        // StringTokenizer를 사용하여 공백을 기준으로 키를 분리
        StringTokenizer tokenizer = new StringTokenizer(input);

        // hasMoreTokens은 ?
        while (tokenizer.hasMoreTokens()) {
            list.add(Integer.parseInt(tokenizer.nextToken()));
        }

        // 두 변수가 필요한가?
        int diff = 0;
        int pos = 0;

        // list.size ? list.get?
        for (int i = 1; i < list.size(); i++) {

            int sub = list.get(i + 1) - list.get(i);
            if (diff < sub) {
                diff = sub;
                pos = i;
            }

        }
        // 결과 출력
        System.out.println("가장 키가 많이 자란 연도는 : " + (pos + 2015) + "년, 키는" + diff + "cm");
        sc.close();
    }
}
