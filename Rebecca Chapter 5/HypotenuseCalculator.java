import java.util.Scanner;

public class HypotenuseCalculator {

    // Method to calculate the hypotenuse of a right triangle
    public static double hypotenuse(double side1, double side2) {
        // Using the Pythagorean theorem: hypotenuse = sqrt(side1^2 + side2^2)
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for the lengths of the two sides
        System.out.print("Enter the length of side 1: ");
        double side1 = scanner.nextDouble();
        
        System.out.print("Enter the length of side 2: ");
        double side2 = scanner.nextDouble();
        
        // Calculate the hypotenuse using the hypotenuse method
        double hypotenuseLength = hypotenuse(side1, side2);
        
        // Display the result
        System.out.printf("The length of the hypotenuse is: %.2f%n", hypotenuseLength);
        
        // Close the scanner
        scanner.close();
    }
}