package oop;

// modifier(제어자)

// 접근 제어자: public, protected, default, private
//점점 범위가 좁아짐

// 기타: static, final, abstract, synchronized, native..etc

// static: 공통(유)  --> Card 프로그램에 작성해놓음.
// final: 마지막의, 변경될 수 없는(클래스, 메서드, 맴버변수, 지역변수)
// 클래스(상속 금지), 맴버,지역변수(상수 개념됨,변경X), 메서드(오버라이딩 금지)
//===> 쓰기 전 무조건 초기화해야 한다.
// abstract: 

//접근 제어자
//왜 쓰는가? 캡슐화
// 외부에서 불러서 쓸 때 안 내용물이 중요하지 않음. 구현만 되면 되기 때문에 캡슐처럼 감싸둔 것.
//public:접근 제한 없음
//private: 같은 클래스 내에서만 접근 가능
//default: 접근 제어자 사용 안하는 경우.
// ===> 같은 패키지 내에서만 접근 가능, 다른 패키지라면 자손 클래스에서 접근 가능
//protected: 

public class ModifierEx {

    public static void main(String[] args) {

    }

}
