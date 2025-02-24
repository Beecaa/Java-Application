
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

public class CatchBlockOrder {
    public static void main(String[] args) {
        try {
            throw new ExceptionB("This is ExceptionB");
        }

        catch (ExceptionB e) {
            System.out.println("Caught ExceptionB: " + e.getMessage());
        }
    }
} 
