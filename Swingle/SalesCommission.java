import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double baseSalary = 200.0;
        double commissionRate = 0.09;
        double totalSales = 0.0;

        System.out.print("Enter the number of items sold: ");
        int numItems = input.nextInt();

        for (int i = 1; i <= numItems; i++) {
            System.out.print("Enter the price of item " + i + ": ");
            double itemPrice = input.nextDouble();
            totalSales += itemPrice;
        }

        double commission = totalSales * commissionRate;
        double totalEarnings = baseSalary + commission;

        System.out.printf("Total sales: $%.2f\n", totalSales);
        System.out.printf("Commission: $%.2f\n", commission);
        System.out.printf("Total earnings: $%.2f\n", totalEarnings);

        input.close();
    }
}