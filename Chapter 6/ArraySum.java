import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[10]; // Array to hold 10 numbers

        int sum1 = 0; // Sum of elements from index 2 to 6
        int sum2 = 0; // Sum of elements from index 7 to 9
        int sub;

        // Input loop to populate the array
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number: ");
            num[i] = input.nextInt();
        }

        // Calculate sum1 (indices 2 to 6 inclusive)
        for (int i = 2; i <= 6; i++) {
            sum1 += num[i];
        }

        // Calculate sum2 (indices 7 to 9 inclusive)
        for (int i = 7; i <= 9; i++) {
            sum2 += num[i];
        }

        // Calculate the difference
        sub = sum1 - sum2;

        // Output the result
        System.out.println("The result is: " + sub);
    }
}

/* Key Changes Made:
Used the num array correctly: Access elements using num[i] with proper indices.
Loops for summation: Added loops to sum up specific ranges of indices instead of manually adding them.
Removed unused sum variable: The focus is now on sum1, sum2, and their difference.
Clarified the output: The program now correctly computes and displays the result.
