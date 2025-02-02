import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 0;
        int largest = Integer.MIN_VALUE;

        while (counter < 10) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            if (number > largest) {
                largest = number;
            }

            counter++;
        }

        System.out.println("The largest number is: " + largest);

        input.close();
    }
}