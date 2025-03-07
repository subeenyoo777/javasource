package extend;

public class SubStringEx {
    public static void main(String[] args) {

        SubString obj = new SubString();
        // 1. 부모인스턴스 생성
        // 2.자식인스턴스 생성

        System.out.println("이름: " + obj.name);// 춘향이(SubString 프로그램)
        // 중복이면 내꺼가 먼저 우선시 됨
        obj.list();

        // print: 홍길동 상위 클래스 이름 (ListString 프로그램)

        // 성춘향 하위 클래스 이름으 출력을 원한다면?
        // 재정의(오버라이딩)
        // print: 성춘향 하위 클래스 이름

        // 둘 다 원할 시 ->spuer.list()
        // print: 홍길동 상위 클래스 이름, 성춘향 하위 클래스 이름

    }
}
