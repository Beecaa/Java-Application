import java.util.Scanner;

public class Multiples {

    public static boolean isMultiple(int num1, int num2) {
        return num2 % num1 == 0; // Returns true if the remainder is 0, false otherwise
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter pairs of integers to check if the second is a multiple of the first.");
        System.out.println("Enter any non-numeric input to stop.");

        while (input.hasNextInt()) {
            System.out.print("Enter the first integer: ");
            int number1 = input.nextInt();

            System.out.print("Enter the second integer: ");
            int number2 = input.nextInt();

            if (isMultiple(number1, number2)) {
                System.out.printf("%d is a multiple of %d%n", number2, number1);
            } else {
                System.out.printf("%d is NOT a multiple of %d%n", number2, number1);
            }
            System.out.println(); // Add a newline for readability
        }
       
    }
}