import java.util.Scanner;

public class CircleArea {

    // Method to calculate the area of a circle
    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2); // Area = π * radius^2
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        // Calculate the area using the circleArea method
        double area = circleArea(radius);
        
        // Display the result
        System.out.printf("The area of the circle with radius %.2f is: %.2f%n", radius, area);
        
        // Close the scanner
        scanner.close();
    }
}