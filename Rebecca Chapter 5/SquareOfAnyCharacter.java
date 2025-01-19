import java.util.Scanner;

public class SquareOfAnyCharacter {
    
    // Method to display a square of a specified character
    public static void squareOfAsterisks(int side, char fillCharacter) {
        for (int i = 0; i < side; i++) {
            // Print a row of the specified fillCharacter
            for (int j = 0; j < side; j++) {
                System.out.print(fillCharacter);
            }
            System.out.println(); // Move to the next line after printing a row
        }
    }

    public static void main(String[] args) {
        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the side length and fill character
        System.out.print("Enter the side length of the square: ");
        int side = scanner.nextInt();

        System.out.print("Enter the fill character: ");
        char fill = scanner.next().charAt(0);  // Read the character input

        // Call the squareOfAsterisks method to display the square
        squareOfAsterisks(side, fill);

        scanner.close();
    }
}
