package condition;

import java.util.Scanner;

public class ifTest5 {
    public static void main(String[] args) {
        
        //주사위
        //무작위로 주사위를 돌렸을 때 1~6이 나온다.

        //실행할 때마다 랜덤으로 값 나옴. 
        //범위가 정해져 있는데 0.0 <= 1.0
        System.out.println(Math.random()); 
        // ((Math.random() * 6) )  : 0~5 값이 나온다.
        // ((Math.random() * 6) ) + 1
 
         int num = (int)((Math.random() * 6) ) + 1;
 
    //num 이 1이면, 주사위 1번이 나왔습니다.
   if (num == 1){
        System.out.println("주사위 1번이 나왔습니다.");
    } 

    else if (num == 2){
        System.out.println("주사위 2번이 나왔습니다.");
    } 

    else if (num == 3){
        System.out.println("주사위 3번이 나왔습니다.");
    } 

    else if (num == 4){
        System.out.println("주사위 4번이 나왔습니다.");
    } 

    else if (num == 5){
        System.out.println("주사위 5번이 나왔습니다.");
    } 

    else if (num == 6){
        System.out.println("주사위 6번이 나왔습니다.");
    } 

    }
}
