package thread;

public class AccountEx {

    public static void main(String[] args) {

        AccUser accUser = new AccUser();

        Thread t1 = new Thread(accUser);
        Thread t2 = new Thread(accUser);

        t1.start();
        t2.start();
    }
}
