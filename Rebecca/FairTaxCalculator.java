import java.util.Scanner;

public class FairTaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define the FairTax rate (adjusted for potential discrepancy)
        double fairTaxRate = 0.30; // Assuming a 30% rate for calculations

        // Define expense categories (modify or add as needed)
        String[] categories = {"Housing", "Food", "Clothing", "Transportation", "Education", "Health Care", "Vacations"};
        double[] expenses = new double[categories.length];

        // Get user input for expenses
        System.out.println("Enter your estimated monthly expenses for each category:");
        for (int i = 0; i < categories.length; i++) {
            System.out.print(categories[i] + ": $");
            expenses[i] = input.nextDouble();
        }

        // Calculate total monthly expenses
        double totalExpenses = 0;
        for (double expense : expenses) {
            totalExpenses += expense;
        }

        // Calculate estimated monthly FairTax
        double estimatedFairTax = totalExpenses * fairTaxRate;

        // Display results
        System.out.println("\nEstimated Monthly Expenses:");
        for (int i = 0; i < categories.length; i++) {
            System.out.printf("%-15s: $%.2f\n", categories[i], expenses[i]);
        }
        System.out.printf("Total Expenses:                 $%.2f\n", totalExpenses);
        System.out.printf("Estimated Monthly FairTax:     $%.2f\n", estimatedFairTax);

        System.out.println("\n**Note:** This is an estimated calculation based on a " +
                fairTaxRate * 100 + "% FairTax rate. The actual FairTax might differ.");
    }
}