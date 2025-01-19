import java.util.Scanner;

public class Exponentiation {

    // Method to calculate base raised to the power of exponent
    public static int integerPower(int base, int exponent) {
        int result = 1; // Initialize result to 1 (the multiplicative identity)
        
        // Loop to calculate base^exponent
        for (int i = 0; i < exponent; i++) {
            result *= base; // Multiply result by base for each iteration
        }
        
        return result; // Return the final result
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for base and exponent
        System.out.print("Enter the base (integer): ");
        int base = scanner.nextInt();
        
        System.out.print("Enter the exponent (positive nonzero integer): ");
        int exponent = scanner.nextInt();
        
        // Validate the exponent
        if (exponent <= 0) {
            System.out.println("Exponent must be a positive, nonzero integer.");
        } else {
            // Calculate the power using the integerPower method
            int result = integerPower(base, exponent);
            // Display the result
            System.out.printf("%d raised to the power of %d is: %d%n", base, exponent, result);
        }

        // Close the scanner
        scanner.close();
    }
}