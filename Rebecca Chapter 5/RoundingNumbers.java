import java.util.Scanner;

public class RoundingNumbers {

    public static int roundToInteger(double number) {
        return (int) Math.floor(number + 0.5);
    }

    public static double roundToTenths(double number) {
        return Math.floor(number * 10 + 0.5) / 10;
    }

    public static double roundToHundredths(double number) {
        return Math.floor(number * 100 + 0.5) / 100;
    }

    public static double roundToThousandths(double number) {
        return Math.floor(number * 1000 + 0.5) / 1000;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number (or 'q' to quit): ");
            if (input.hasNextDouble()) {
                double num = input.nextDouble();

                System.out.printf("Original: %.4f%n", num); // Print original with 4 decimal places
                System.out.printf("Integer: %d%n", roundToInteger(num));
                System.out.printf("Tenths: %.1f%n", roundToTenths(num)); // Print tenths with 1 decimal place
                System.out.printf("Hundredths: %.2f%n", roundToHundredths(num)); // Print hundredths with 2 decimal places
                System.out.printf("Thousandths: %.3f%n", roundToThousandths(num)); // Print thousandths with 3 decimal places
                System.out.println(); // Add an empty line for better readability
            } else if (input.next().equalsIgnoreCase("q")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a number or 'q'.");
            }
        }
        input.close();
        System.out.println("Goodbye!");
    }
}