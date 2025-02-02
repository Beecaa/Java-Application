import java.util.Scanner;

public class StaticMethodExamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example 1: No parameters, no return value
        StaticMethodExamples.printWelcomeMessage();

        // Example 2: Parameters, no return value
        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        int width = scanner.nextInt();
        StaticMethodExamples.calculateArea(length, width);

        // Example 3: Parameters with a return value
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double circumference = StaticMethodExamples.calculateCircumference(radius);
        System.out.printf("The circumference of the circle is: %.2f%n", circumference);

        // Example 4: Method overloading
        StaticMethodExamples.displayMessage(); // No argument
        System.out.print("Enter your name: ");
        scanner.nextLine();  // Consume newline
        String name = scanner.nextLine();
        StaticMethodExamples.displayMessage(name); // With argument

        // Example 5: Utility function
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = StaticMethodExamples.convertToFahrenheit(celsius);
        System.out.printf("The temperature in Fahrenheit is: %.2f%n", fahrenheit);

        scanner.close();
    }

    public static void printWelcomeMessage() {
        System.out.println("Welcome to the Static Method Example!");
    }

    public static void calculateArea(int length, int width) {
        int area = length * width;
        System.out.println("The area of the rectangle is: " + area);
    }

    public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void displayMessage() {
        System.out.println("Hello, World!");
    }

    public static void displayMessage(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static double convertToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
}
