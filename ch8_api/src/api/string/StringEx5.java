package api.string;

public class StringEx5 {

    public static void main(String[] args) {

        System.out.println("AB의 문자열 횟수 : " + count("12345AB12AB345AB", "AB"));
        System.out.println("AB의 문자열 횟수 : " + count("12345", "AB"));

        // count는 주어진 문자열 (src) 안에서 특정 문자열 (target)이 몇 번 나타나는지를 저장하는 역할
    }

    public static int count(String src, String target) {
        // src 문자열에서 target이 몇 번 등장하는지 세는 변수 : count

        int count = 0, pos = 0; // count는 카운트할 변수, pos는 검색 시작 위치

        // 반복문: src에서 target을 찾아서 찾을 때마다 count를 증가
        while ((pos = src.indexOf(target, pos)) != -1) {
            count++; // target을 발견할 때마다 count를 1 증가시킴
            pos += target.length(); // target의 길이만큼 이동하여 중복 카운트를 방지

        }
        return count; // 최종적으로 발견된 target의 횟수 반환

    }
}
