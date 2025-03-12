package exception;

public class ThrowsEx {

    public static void main(String[] args) throws ClassNotFoundException {
        print();
    }

    // Add throws declaration) 직접
    // Surrond with try/cath ) 던짐

    static void print() throws ClassNotFoundException {
        Class.forName("");

    }

}
