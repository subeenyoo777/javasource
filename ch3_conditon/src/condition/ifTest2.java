package condition;

public class ifTest2 {
    public static void main(String[] args) {
        
        int score = 93;

        //score 가 90보다 크면 점수가 90점 이상입니다, 그리고 등급은 A입니다. 출력
        //score 가 90보다 작으면 점수가 90점 미만입니다, 그리고 등급은 B입니다. 출력
        
        if ( score > 90 ) {
           System.out.println("점수가 90점 이상입니다"); 
           System.out.println("등급은 A입니다."); 
        } else {
            System.out.println("점수가 90점 미만입니다"); 
            System.out.println("등급은 B입니다."); 
        }


    }
    
}
