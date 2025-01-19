import java.util.Scanner;

public class ReverseDigits {

    public static int reverseNumber(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int lastDigit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + lastDigit; // Add it to the reversed number
            number = number / 10; // Remove the last digit from the original number
        }

        return reversedNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        int reversed = reverseNumber(num);
        System.out.println("The reversed number is: " + reversed);

        input.close();
    }
}