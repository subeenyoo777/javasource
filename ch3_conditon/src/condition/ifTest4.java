package condition;

import java.util.Scanner;

public class ifTest4 {
    public static void main(String[] args) {
        
        //score 점수 입력을 받아
        //score >= 90 등급은 A입니다. : if()
        //score >= 80 등급은 B입니다. : else if()
        //score >= 70 등급은 C입니다. : else if()
        //score >= 60 등급은 D입니다. : else if()
        //score < 60 등급은 F입니다.  : else

//if로 만약 모든 걸 다 할 경우, elseif 다르게 다 검사를 한다.

        Scanner scanner = new Scanner(System.in);
        System.out.println("점수 입력");
        String input = scanner.nextLine();
        int score =  Integer.parseInt(input);

        if ( score >= 90 ) {
            System.out.println("등급은 A입니다."); 
        }else if(score >= 80){
                System.out.println("등급은 B입니다."); 

        }else if(score >= 70){
                    System.out.println("등급은 C입니다."); 

                   }else if(score >= 60){
                        System.out.println("등급은 D입니다."); 
                    
         } else { //else에선 조건 걸 수 없다.
             System.out.println("등급은 F입니다."); 
         }
 scanner.close();
     }
    
}
