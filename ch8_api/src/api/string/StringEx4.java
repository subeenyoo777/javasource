package api.string;

public class StringEx4 {

    public static void main(String[] args) {
        StringEx4 obj = new StringEx4();
        String[] names = { "Queen", "Tod", "Kim", "Lee", "choi" };

        String result = obj.findKim(names);
        System.out.println(result);
    }

    public String findKim(String[] seoul) {
        // 반환 : "kim"은 3번째에 있다.
        // findKim 메서드의 역할은 seoul 배열 안에서 "Kim"이라는 이름이 몇 번째에 있는지를 찾는 것

        int i = 0;
        for (; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                break;
            }
        }
        return "kim은" + (i + 1) + "번째에 있다";

        // (2) list 작성
        // int i = Arrays.asList(seoul).indexOf("kim");
        // return "kim은" + (i + 1) + "번째에 있다";

    }
}
