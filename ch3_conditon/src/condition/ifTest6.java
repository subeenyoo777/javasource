package condition;

//if 구문은 중첩이 가능하다.

import java.util.Scanner;

public class ifTest6 {
    public static void main(String[] args) {
 
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("점수 입력");
    String input = scanner.nextLine();
    int score =  Integer.parseInt(input);

        char grade = ' ', opt = '0';
        if (score >= 90){
            grade = 'A';
            if(score >= 98){
                 opt = '+';   
                }else if(score < 94 ){
                opt = '-';
                }
        }else if(score >= 80){
        grade = 'B';
        if(score >= 88){
                opt = '+';
        }else if(score<84){
                opt = '-';
        }
        }else{
        grade = 'C';
        }
    
System.out.printf("당신의 학점은 %c%c 입니다", grade, opt);
}
}