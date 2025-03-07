package extend;

//상속(isa 관계)

// 기존의 클래스를 재사용하여 새로운 클래스 작성
// 장점
// 작은 양의 코드로 새로운 클래스 작성 가능
// 코드를 공통적으로 관리 가능 => 코드의 추가 및 변경 용이
//단일 상속(single)만 허용.
// class Child extends Parent, Tv (x. 하나만 가능)

// Object 클래스 - 모든 클래스의 조상.
// 자동적으로 무조건 object 클래스를 상속받는다.
// 모든 클래스 extend Object

//조상클래스: 부모, super, 상위 클래스, 기반(base)클래스
// 자손 클래스: 자식, sub, 하위, 파생(derived  [diráiv] ) 클래스
public class Parent {
    int age;

}
