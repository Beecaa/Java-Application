import java.util.Scanner;

public class SeparatingDigits {

    public static int quotient(int a, int b) {
        return a / b;
    }

    public static int remainder(int a, int b) {
        return a % b;
    }

    public static void displayDigits(int number) {
        if (number < 1 || number > 99999) {
            System.out.println("Number must be between 1 and 99999.");
            return; // Stop the method if input is invalid
        }
        
        int divisor = 10000; // Start with the largest place value
        while (divisor > 0) {
            int digit = quotient(number, divisor);
            System.out.print(digit + "     "); // Print digit with five spaces
            number = remainder(number, divisor); // Update number
            divisor = quotient(divisor, 10); // Reduce the divisor by a factor of 10
        }
        System.out.println(); // New line at the end
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 1 and 99999: ");
        if(input.hasNextInt()){
            int num = input.nextInt();
            displayDigits(num);
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
        input.close();
    }
}