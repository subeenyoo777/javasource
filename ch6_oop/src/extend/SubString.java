package extend;
//오버라이딩(부모 클래스의 메서드를 자식 클래서에서 재정의) 

//조건

//이름이 같아야 한다
//매개변수 같아야 한다
// 반환타입이 같아야 한다. (똑같다고 보면 된다)

//재정의: 부모가 정의해준 내용을 자식에게 맞춰 변경하기 위함. 그런 개념

//오버로딩(Overloading) vs 오버라이딩(Overriding)
//오버라이딩: 상속, 상속받은 메서드의 내용을 변경 것
//오버로딩: 동일한 메서드를 여러개 정의

public class SubString extends ListString {
    String name = "성춘향";

    @Override // @Override 이름 : 어노테이션
    public void list() {
        // TODO Auto-generated method stub
        super.list();
        System.out.println(name + " 하위 클래스 이름");
    }

    public void print() {
        list();
        super.list();// 부모의 특정 메서드 호출
        exec(); // super.exec();
    }

}

// 오버로딩 (Overloading)
// 같은 이름의 메서드를 다른 매개변수로 여러 번 정의
// 메서드 이름을 재사용하여 코드 가독성 향상
// 메서드 이름은 같지만 매개변수가 달라야 함
// 오버로딩을 구분할 수 있는 기준이 아님
// 컴파일 타임에 결정됨 (정적 바인딩)

// 오버라이딩 (Overriding)
// 부모 클래스의 메서드를 자식 클래스에서 재정의
// 부모 클래스의 메서드 동작을 자식 클래스에서 변경
// 메서드 이름, 매개변수 모두 동일해야 함
// 님 부모 클래스의 리턴 타입과 자식 클래스의 리턴 타입은 동일해야 함