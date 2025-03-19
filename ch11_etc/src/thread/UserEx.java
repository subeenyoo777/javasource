package thread;

public class UserEx {

    public static void main(String[] args) {
        // User1, User2
        Calc calc = new Calc();

        Thread thread1 = new User1(calc);
        Thread thread2 = new User2(calc);

        thread1.start();
        thread2.start();
    }
}
