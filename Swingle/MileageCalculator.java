import java.util.Scanner;

public class MileageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalMiles = 0;         // Total miles driven across all trips
        int totalGallons = 0;       // Total gallons used across all trips

        while (true) {
            System.out.print("Enter miles driven (-1 to quit): ");
            int miles = input.nextInt();
            if (miles == -1) {
                break; // Sentinel value to terminate the loop
            }

            System.out.print("Enter gallons used: ");
            int gallons = input.nextInt();

            if (gallons != 0) {
                double milesPerGallon = (double) miles / gallons;
                System.out.printf("Miles per gallon for this trip: %.2f%n", milesPerGallon);
            } else {
                System.out.println("Gallons cannot be zero.");
                continue; // Skip the rest of the loop
            }

            // Update totals for combined calculation
            totalMiles += miles;
            totalGallons += gallons;

            if (totalGallons != 0) {
                double combinedMilesPerGallon = (double) totalMiles / totalGallons;
                System.out.printf("Combined miles per gallon so far: %.2f%n", combinedMilesPerGallon);
            }
        }

        if (totalGallons != 0) {
            double finalCombinedMilesPerGallon = (double) totalMiles / totalGallons;
            System.out.printf("Final combined miles per gallon: %.2f%n", finalCombinedMilesPerGallon);
        } else {
            System.out.println("No trips were recorded.");
        }

        input.close();
    }
}
