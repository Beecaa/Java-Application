public class EnhancedForStatement_16 {
    public static void main(String[] args) {
        double sum = 0;
        for (String arg : args) {
            sum += Double.parseDouble(arg);
        }
        System.out.println("Sum: " + sum);
    }
}
