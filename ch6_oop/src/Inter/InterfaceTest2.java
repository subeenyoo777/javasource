package inter;

interface I {
    void methodB();
}

class AA {
    public void methodA(I i) {
        i.methodB();
    }
}

class BB implements I {

    @Override
    public void methodB() {
        System.out.println("methodB()");
    }
}

class InterfaceTest2 {
    public static void main(String[] args) {
        AA obj1 = new AA();
        obj1.methodA(new BB());
    }
}
