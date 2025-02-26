package condition;


//특정 조건을 만족하면, 다음 문장 실행
//if (조건문) {}

//특정 조건을 만족할 땐 구문 1실행, 만족하지 않을 때는 구문2 실행.
//if(조건문) {구문1} else{구문2}

public class ifTest1 {
    public static void main(String[] args) {
    int x = 0;
    if(x == 0){
        System.out.println("x==0");
    }
    //false 넘어가기
    if(x != 0){
        System.out.println("x!=0");
    }
    //false 넘어가기
    if(!(x == 0)){
        System.out.println("!(x == 0)");
    }
    if(!(x != 0)){
        System.out.println("!(x != 0)");
    }
    }
}
