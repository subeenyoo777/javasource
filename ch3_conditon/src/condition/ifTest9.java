package condition;

import java.util.Scanner;

public class ifTest9 { public static void main(String[] args) {
    
    //윤년, 평년 구하기
    //년도 입력 받기.
    //입력받은 년도가 윤년인지 평년인지 출력
    //윤년:(1)년도를 4로 나눈 나머지가 0이고, 년도를 100으로 나눈 나머지가 0이 아니면
    // or    (2)년도를 400으로 나눈 나머지가 0일 때.

    int year;

     Scanner scanner = new Scanner(System.in);
       System.out.println("년도 입력");
        String input = scanner.nextLine();

        year = Integer.parseInt(input);

if (( year % 4 == 0 ) && (year % 100 != 0 || year % 400 == 0)) {
    System.out.println("윤년입니다");  
}
else{System.out.println("평년입니다"); }
              
}

}
    