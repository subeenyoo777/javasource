package inter;
// 의존성

// 코드 하나 고치면 또 고쳐야 하는 것 (1:1 아닌 차후에 수천 개가 될 수 있다)
// ->인터페이스로 해결

class A {
    public void methodA(B b) {
        b.methodB(); //관계는 없어도 불러다 쓸 수 있음(의존관계 생겨버림.)
    }
}

class B {
    public void methodB() {
        System.out.println("methodB()");
    }
}

class InterfaceTest1 {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.methodA(new B());
    }
}
