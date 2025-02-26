package op;


public class CcompareEx2 { public static void main(String[] args) {

    float f1 = 0.1f;
    double d1 = 0.1;
    double d2 = (double)f1;

    //%19.17f : 19자리로 표현, 소수점 17자리까지 나와달라. 
    //소수점으로 저장할 때 double로 한다.
    System.out.printf("10.0 == 10.0f %b\n", 10.0 == 10.f); //ture
    System.out.printf("0.1 == 0.1f %b\n", 0.1 == 0.1f); //false
    System.out.printf("f1 == %19.17f\n", f1); //10000000149011612
    System.out.printf("d1 == %19.17f\n", d1); // 0.10000000000000000
    System.out.printf("d2 == %19.17f\n", d2); //0.10000000149011612
    System.out.printf("f1 == d1 %b\n", f1 == d1 ) ;
    System.out.printf("d1 == d2 %b\n",  d1 == d2) ;
    System.out.printf("d2 == f1 %b\n", d2 == f1 ) ;
    System.out.printf("(float)d1 == f1 %b\n", (float)d1 == f1 ) ;

}
    
}
