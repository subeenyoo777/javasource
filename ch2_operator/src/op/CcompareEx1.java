package op;

//비교연산자: True/ False
//대소 비교: <, >, <=, >=
//등가 비교: ==(equal), != (not equal)


// \t : (tab)
// %b : (boolean 값 출력)
//형식화된 출력(엔터는 안들어가 있음)
//두 변수의 타입이 다른 경우, 타입을 맞춘 후 비교.

public class CcompareEx1 { public static void main(String[] args) {
System.out.printf("10 == 10.0f \t %b\n", (10==10.0f));    
System.out.printf("'0' == 0 \t %b\n", ( '0' == 0 ));    // 48 == 0 //문자는 코드로 무조건 바꾼다. 문자 0 = 48..과 같은지 물어본 것.
System.out.printf("'A' == 65 \t %b\n", ('A'== 65));    //65 == 65
System.out.printf("'A' > B \t %b\n", ( 'A' > 'B'));    // 65 > 66
System.out.printf("'A' + 1 ! = 'B' \t %b\n", ('A'+1 != 'B'));  // 65+1 != 66 
}
    
}
