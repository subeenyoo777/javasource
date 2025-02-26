package op;
public class ArrthmeticsEx3 {

    public static void main(String[] args) {
    
    char c1 = 'a';
    char c2 = c1;
    char c3 = ' ';
    //byte, short, char 연산 수행 시 연산의 결과가 int 형으로 변경됨.
      //c3 = c1 + 1;  //char 문자형에 int가 들어오려고 하기에 오류가 뜨는 것.
    
      //방법1
    int result =  c1 + 1;

    //방법2
    c3 = (char)(c1 + 1);

    c2++; // c2 = c2+1
    c2++; // 

System.out.println("c1 = " +c1); 
System.out.println("c2 = " +c2); 

//문자는 더하기가 된다.
System.out.println("result = " +result); //98, 왜?(인코딩; 컴퓨터에서 문자를 쓰면 코드값으로 변경됨.) 97+1/ A =65, a=65
System.out.println("c3 = " +c3); //b

} 
}
