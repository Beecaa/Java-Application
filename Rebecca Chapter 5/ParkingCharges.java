import java.util.Scanner;

public class ParkingCharges {

    public static double calculateCharges(double hoursParked) {
        double charge;

        if (hoursParked <= 3) {
            charge = 2.00;
        } else if (hoursParked <= 24) {
            charge = 2.00 + 0.50 * Math.ceil(hoursParked - 3);
            charge = Math.min(charge, 10.00);
        } else {
            charge = 10.00;
        }

        return charge;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalReceipts = 0.0;
        int customerNumber = 1;

        System.out.println("Enter hours parked for each customer (negative number to finish):");

        while (true) {
            System.out.print("Customer " + customerNumber + ": ");
            double hoursParked = scanner.nextDouble();

            if (hoursParked < 0) {
                break; // Exit the loop if a negative number is entered
            }

            if (hoursParked == 0 || hoursParked > 24) {
                System.out.println("Invalid input. Hours must be between 0 and 24 (or negative to finish).");
                continue; // Go to next iteration
            }

            double charge = calculateCharges(hoursParked);
            totalReceipts += charge;

            System.out.printf("Hours Parked: %.2f, Charge: $%.2f%n", hoursParked, charge);
            customerNumber++;
        }

        System.out.printf("Total Receipts for the day: $%.2f%n", totalReceipts);
        scanner.close();
    }
}