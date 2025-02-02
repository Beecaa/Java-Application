import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter account number: ");
            int accountNumber = input.nextInt();

            System.out.print("Enter initial balance: ");
           int initialBalance = input.nextInt();

            System.out.print("Enter total charges of items: ");
            int totalChargesofitems = input.nextInt();

            System.out.print("Enter total credits: ");
           int totalCredits = input.nextInt();

            System.out.print("Enter credit limit: ");
            int creditLimit = input.nextInt();

            int newBalance = ( initialBalance + totalChargesofitems - totalCredits); // for calculating new balance and typecasting
			

            System.out.printf("New balance is : " + newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded");
			 else
				System.out.println("Credit limit not exceeded");
            }
        }

        input.close();
    }
}