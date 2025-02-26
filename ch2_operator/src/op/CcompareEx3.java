package op;

//문자와 문자열은 다르다. 
//문자열 : "a", "abc"..."" 쓰면된다.


public class CcompareEx3 { public static void main(String[] args) {
//변수 선언: 기본 타입으로 가능(ch1-VarByteEx1 참조)
//문자열은 기본 타입으로 선언하지 않는다. 객체 타입으로 선언한다. 
//대문자로 시작하면 객체 타입 시작
//기본타입과 달리 객체 타입은 할 수 있는 게 많다.

String str1 = "abc"; 
String str2 = "abc"; //이 방법도 객체 선언으로 허용.// "abc" 같은 문자열이면 포인터만 하며, 재사용한다.
String str3 = new String("abc"); //객체할 땐, Nnew... 로 선언하나//new.. 선언 시 heap 공간에 저장

// str1(또는 str2)) 을 저장하는 공간과 str3 을 저장하는 공간은 다르다.
//같은 공간에서 저장된 문자열을 비교시,  == 을 사용(값 비교)하면 true
//다른 공간에서 저장된 문자열을 비교시,  == 을 사용(주소비교)

System.out.printf("str1 == str2 == %b\n", (str1 == str2)); // true
System.out.printf("str1 == str3 == %b\n", (str1 == str3)); //false 

//문자열 비교  == 대신에, equals,equalsIgnoreCase(대소문자 구분 없이) 사용. 
//★ abc == ABC: false
System.out.printf("str1.equals(str3) = %b\n", (str1.equals(str3))); //true
System.out.printf("str1.equals(ABC) = %b\n", (str1.equals("ABC"))); //false
System.out.printf("str1.equalsIgnoreCase(str3) = %b\n", (str1.equalsIgnoreCase(str3) )); //true
System.out.printf("str1equalsIgnoreCase(ABC) = %b\n", (str1.equalsIgnoreCase("ABC"))); //true

}
    
}
