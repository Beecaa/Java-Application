import java.text.DecimalFormat;
public class WorldPopulationGrowth {

    public static void main(String[] args) {
        double currentPopulation = 8.1; // Current world population in billions
        double growthRate = 0.0088;     // Annual growth rate as a decimal (0.88%)

        DecimalFormat df = new DecimalFormat("#.###"); // Format for population numbers

        System.out.printf("%-10s %-20s %-20s%n", "Year", "Population (Billions)", "Increase (Billions)");

        double doublePopulation = currentPopulation * 2; // Population target for doubling
        int yearOfDoubling = -1;

        for (int year = 1; year <= 75; year++) {
            double populationIncrease = currentPopulation * growthRate;
            double newPopulation = currentPopulation + populationIncrease;

            // Print the year, population at the end of the year, and the increase
            System.out.printf("%-10d %-20s %-20s%n", year, df.format(newPopulation), df.format(populationIncrease));

            // Check if population doubles and store the year
            if (yearOfDoubling == -1 && newPopulation >= doublePopulation) {
                yearOfDoubling = year;
            }

            currentPopulation = newPopulation; // Update current population
        }

        if (yearOfDoubling != -1) {
            System.out.println("\nThe world population will double in approximately year " + yearOfDoubling + ".");
        } else {
            System.out.println("\nThe world population will not double in the next 75 years at the current growth rate.");
        }
    }
}
