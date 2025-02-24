
import java.io.IOException;

class ExceptionA extends Exception {
    public ExceptionA(String message) {
        super(message);
    }
}

class ExceptionB extends ExceptionA {
    public ExceptionB(String message) {
        super(message);
    }
}

public class Exception2 {
    public static void main(String[] args) {
        try {
            throw new ExceptionA("This is ExceptionA");
        } catch (Exception exception) {
            System.out.println("Caught an exception: " + exception.getMessage());
        }

        try {
            throw new ExceptionB("This is ExceptionB");
        } catch (Exception exception) {
            System.out.println("Caught an exception: " + exception.getMessage());
        }

        try {
            throw new NullPointerException("This is a NullPointerException");
        } catch (Exception exception) {
            System.out.println("Caught an exception: " + exception.getMessage());
        }

        try {
            throw new IOException("This is an IOException");
        } catch (Exception exception) {
            System.out.println("Caught an exception: " + exception.getMessage());
        }
    }
}
