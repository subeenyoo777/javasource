package exception;

public class WorngPasswordException extends Exception {

    public WorngPasswordException() {
        super();
    }

    public WorngPasswordException(String message) {
        super(message);
    }
}
