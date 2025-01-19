import java.util.Scanner;

public class EvenOrOdd {

    public static boolean isEven(int number) {
        return number % 2 == 0; // If remainder is 0, it's even
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter some integers to see if they are even or odd.");
        System.out.println("Enter any non-numeric input to stop.");

        while (input.hasNextInt()) { // Keep going as long as the user enters integers
            System.out.print("Enter an integer: ");
            int num = input.nextInt();

            if (isEven(num)) {
                System.out.printf("%d is even.%n", num);
            } else {
                System.out.printf("%d is odd.%n", num);
            }
        }
        System.out.println("No more integers to check. Goodbye!");
        input.close();
    }
}