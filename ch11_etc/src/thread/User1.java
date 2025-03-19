package thread;

public class User1 extends Thread {

    private Calc calc;

    public User1(Calc calc) {
        setName("User 1");
        this.calc = calc;
    }

    @Override
    public void run() {
        calc.setMemory(100);
    }

}
