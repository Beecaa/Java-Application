import java.util.ArrayList;

public class PerfectNumbers {

    // Method to check if a number is perfect
    public static boolean isPerfect(int number) {
        int sumOfFactors = 0;
        
        // Find the factors of the number (excluding the number itself)
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfFactors += i;  // Add the factor to the sum
            }
        }
        
        // Check if the sum of factors equals the number
        return sumOfFactors == number;
    }

    // Method to display all perfect numbers between 1 and 1000, and their factors
    public static void displayPerfectNumbers(int limit) {
        for (int i = 1; i <= limit; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " is a perfect number. Its factors are: ");
                ArrayList<Integer> factors = new ArrayList<>();
                
                // Find and print the factors of the perfect number
                for (int j = 1; j <= i / 2; j++) {
                    if (i % j == 0) {
                        factors.add(j);
                    }
                }
                
                // Print the factors
                System.out.println(factors);
            }
        }
    }

    public static void main(String[] args) {
        // Display perfect numbers between 1 and 1000
        System.out.println("Perfect numbers between 1 and 1000:");
        displayPerfectNumbers(1000);
        
        // Test larger numbers (optional: use caution as computation time may increase)
        int[] largerNumbers = {8128, 33550336}; // Examples of larger perfect numbers
        for (int num : largerNumbers) {
            if (isPerfect(num)) {
                System.out.println(num + " is a perfect number.");
            }
        }
    }
}

 
