package thread;

public class User2 extends Thread {

    private Calc calc;

    public User2(Calc calc) {
        setName("User 2");
        this.calc = calc;
    }

    @Override
    public void run() {
        calc.setMemory(200);
    }

}
