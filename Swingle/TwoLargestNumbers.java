import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables to track the largest and second largest numbers.
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Loop to input 10 numbers
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();

            // Check if the current number is larger than the largest
            if (number > largest) {
                secondLargest = largest;  // Update second largest
                largest = number;         // Update largest
            } 
            // Check if the current number is smaller than largest but larger than secondLargest
            else if (number > secondLargest) {
                secondLargest = number;   // Update second largest
            }
        }

        // Output the largest and second largest numbers
        System.out.println("The largest number is: " + largest);
        System.out.println("The second largest number is: " + secondLargest);

        scanner.close();
    }
}
