import java.util.Scanner;

public class RoundNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for the number of values to process
        System.out.print("Enter the number of double values you want to round: ");
        int count = scanner.nextInt();
        
        // Loop for the specified number of values
        for (int i = 0; i < count; i++) {
            System.out.print("Enter double value " + (i + 1) + ": ");
            double number = scanner.nextDouble();

            // Round the number to the nearest integer using Math.floor
            int roundedNumber = (int) Math.floor(number + 0.5);

            // Display the original and rounded numbers
            System.out.printf("Original number: %.2f, Rounded number: %d%n", number, roundedNumber);
        }
	}
}