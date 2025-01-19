import java.util.Scanner;

public class SquareOfAsterisks {
    
    // Method to display a square of asterisks
    public static void squareOfAsterisks(int side) {
        for (int i = 0; i < side; i++) {
            // Print a row of asterisks
            for (int j = 0; j < side; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after printing a row
        }
    }

    public static void main(String[] args) {
        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the side length
        System.out.print("Enter the side length of the square: ");
        int side = scanner.nextInt();

        // Call the squareOfAsterisks method to display the square
        squareOfAsterisks(side);
        
	}
}
  
