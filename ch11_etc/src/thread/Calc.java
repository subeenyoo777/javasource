package thread;

public class Calc {

    private int memory;

    public int getMemory() {
        return memory;
    }

    // synchronized.. 동기화 메서드
    public synchronized void setMemory(int memory) {

        this.memory = memory;

        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ":" + this.memory);
    }

}
