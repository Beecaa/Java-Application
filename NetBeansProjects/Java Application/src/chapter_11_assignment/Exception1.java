
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

class ExceptionC extends ExceptionB {
    public ExceptionC(String message) {
        super(message);
    }
}

public class Exception1 {
    public static void main(String[] args) {
        try {
            throw new ExceptionC("This is ExceptionC!");
        } catch (ExceptionA e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
