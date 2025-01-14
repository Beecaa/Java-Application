import java.util.Scanner;

public class CompareIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        // Compare and display results
        if (num1 > num2) {
            System.out.println(num1 + " is larger");
        } else if (num2 > num1) {
            System.out.println(num2 + " is larger");
        } else {
            System.out.println("These numbers are equal");
        }
    }
}
