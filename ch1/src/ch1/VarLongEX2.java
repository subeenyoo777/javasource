package ch1;

// byte : 8비트
// 숫자 표현 : 2의 8 = 256. 음수부터 표현 256/2 => -128 ~ 127 표현 가능

public class VarLongEX2 {
    public static void main(String[] args) {
         // 변수
         // 기본타입: 정수형, 문자형, 실수형, 불린형
         // 정수형 : byte(1), shoret(2), int(4), long(8)
         // 문자형 : char(2)
         // 실수형 : float(4), double(8)
         // 불린형: boolean(1)

         // 변수선언 : 타입 변수명 = 값;
         // 변수선언 : 타입 변수명 = 값;
         // 변수명 : 단어 2개 조합이 되는 경우 뒷 단어의 시작은 대문자로 한다
         // max-speed : 데이터베이스 필드명
         // long : L.l 붙인다
         long age = 15L, maxSpeed = 100L;
         long max = 256L;
         long money = 1000000000000L;
        
         // 변수값 변경
         age = 30;

         //  System.out.println(age);
         //  System.out.println(maxSpeed);

         // + : 산술연산
         // + : 연결(문자)
         System.out.println(money);
        System.out.println("나이 : " +age + ", 최고속도 : " + maxSpeed + ", max : "+max);
        System.out.println(age + maxSpeed);

    }
}
