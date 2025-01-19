import java.util.Scanner;

public class Minimum {

    public static double minimum3(double num1, double num2, double num3) {
        // Find the smaller of the first two numbers
        double smallestOfFirstTwo = Math.min(num1, num2);

        // Then, find the smaller of that result and the third number
        return Math.min(smallestOfFirstTwo, num3);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three floating-point numbers:");

        System.out.print("Number 1: ");
        double number1 = input.nextDouble();

        System.out.print("Number 2: ");
        double number2 = input.nextDouble();

        System.out.print("Number 3: ");
        double number3 = input.nextDouble();

        double min = minimum3(number1, number2, number3);

        System.out.printf("The smallest number is: %.2f%n", min);

        input.close();
    }
}