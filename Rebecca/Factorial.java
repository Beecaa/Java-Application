public class Factorial {
    public static void main(String[] args) {
        // Loop through numbers from 1 to 20
        for (int n = 1; n <= 20; n++) {
            // Print the factorial of the current number
            System.out.println(n + "! = " + factorial(n));
        }

        // Explain the difficulty of calculating the factorial of 100
        System.out.println("\nDifficulty in calculating 100!:");
        System.out.println("The factorial of 100 is extremely large and exceeds the storage capacity of primitive types like long. Specialized libraries or data types are needed for such large numbers.");
    }

    // Method to calculate the factorial of a number using type long
    public static long factorial(int n) {
        long result = 1; // Initialize the result to 1

        // Multiply result by each number from 1 to n
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result; // Return the calculated factorial
    }
}
