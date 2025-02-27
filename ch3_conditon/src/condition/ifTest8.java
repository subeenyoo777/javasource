package condition;

import java.util.Scanner;

public class ifTest8 {
    public static void main(String[] args) {
     //임금 구하기

     int rate = 9800;
     int hours, pay;

     Scanner scanner = new Scanner(System.in);
       System.out.println("근무시간 입력");
        String input = scanner.nextLine();
     hours = Integer.parseInt(input);
     
     //시간당 임금
     //사용자로부터 근무시간을 입력 받아 Hours 변수에 담기
     //근무시간이 8시간까지는 시간당 임금을 지불
     //8시간 초과 근무 시에는 시간당 임금의 1.5배 지불함.
     //임금 계산 후 pay 변수에 담기
     //최총 출력
     //:받는 임금은 120,000

     //10시간 : 8*9800 + 2 * 9800 * 1.5
     if (  hours > 8 ) {
          pay = rate * 8 +(int)(rate * (hours - 8)* 1.5 );
//소수점은 double로 타입이 바뀜. 소수점 자르고자 int로 받음.
       } else {
          pay = rate * hours;
  }
System.out.println("받는 임금은"+pay);
} 

}



