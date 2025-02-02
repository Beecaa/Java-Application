import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int numValues = input.nextInt();

        System.out.print("Enter the first integer: ");
        int smallest = input.nextInt();

        for (int i = 2; i <= numValues; i++) {
            System.out.print("Enter integer " + i + ": ");
            int number = input.nextInt();

            if (number < smallest) {
                smallest = number;
            }
        }

        System.out.println("The smallest integer is: " + smallest);
    }
}