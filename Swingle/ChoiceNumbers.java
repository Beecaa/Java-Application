
import java.util.Scanner;

public class ChoiceNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;

        // Keep prompting the user until a valid input (1 or 2) is entered
        while (choice != 1 && choice != 2) {
            System.out.print("Enter 1 or 2: ");
            
            // Check if input is an integer
            if (input.hasNextInt()) {
                choice = input.nextInt();  // Read the integer
                
                // Check if input is valid (1 or 2)
                if (choice != 1 && choice != 2) {
                    System.out.println("Invalid input! Please enter 1 or 2.");
                }
            } else {
                System.out.println("Invalid input! Please enter an integer.");
                input.next();  // Clear invalid input
            }
        }

        // Perform actions based on the user's valid choice
        System.out.println("You selected option " + choice + ".");

        input.close();  // Close the Scanner
    }
}
