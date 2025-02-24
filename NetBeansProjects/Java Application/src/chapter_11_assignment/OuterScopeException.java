
public class OuterScopeException {

    public static void anyMethod() {
        try {
            System.out.println("Inside someMethod, about to throw an exception.");
            throw new ArithmeticException("An error occurred in anyMethod.");
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException inside anyMethod.");
        }
    }

    public static void main(String[] args) {
        try {
            anyMethod();
            
            System.out.println("Inside main, about to throw a NullPointerException.");
            throw new NullPointerException("An error occurred in main.");
            
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException in main: " + e.getMessage());
        }
    }
}

