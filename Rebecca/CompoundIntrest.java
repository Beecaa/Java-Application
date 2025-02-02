import java.util.Scanner;

public class CompoundIntrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount invested: ");
        double amount = input.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        for (double rate = 5.0; rate <= 10.0; rate += 1.0) {
            double amountAfterYears = amount * Math.pow(1 + rate / 100, years);

            System.out.printf("Amount after %d years with %.1f%% interest rate: $%.2f%n", years, rate, amountAfterYears);
        }
    }
}