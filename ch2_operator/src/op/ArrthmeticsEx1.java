package op;
public class ArrthmeticsEx1 {
    public static void main(String[] args) {
        
        byte  a = 10, b=4;
     
        //byte, short 연산 수행 시 연산의 결과가 int 형으로 변경됨./ byte c = a + b;.. 오류뜸.
        
        //해결책 1
        // int c = a + b;
               
        
        //해결책 2; 결과값이 -128 ~ 127 사이라면
        byte c = (byte)(a+b); 
    }    
}
