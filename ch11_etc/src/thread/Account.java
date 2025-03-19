package thread;

public class Account {

    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    public void withdraw(int memory) {
        synchronized (this) {
            if (balance >= memory) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                balance -= memory;
            }
        }
    }

    // 또는

    // // 동기화 메서드
    // public synchronized void withdraw(int memory) {

    // if (balance >= memory) {
    // try {
    // Thread.sleep(1000);
    // } catch (InterruptedException e) {
    // e.printStackTrace();
    // }
    // balance -= memory;
    // }
    // }
}
