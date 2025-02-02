public class ProductOfOdds {
    public static void main(String[] args) {
        int product = 1; // Initialize product to 1 (multiplicative identity)

        for (int num = 1; num <= 15; num++) { // Loop through numbers 1 to 15
            if (num % 2 != 0) { // Check if the number is odd
                product *= num; // Multiply the product by the odd number
            }
        }

        System.out.println("The product of odd integers from 1 to 15 is: " + product);
    }
}
