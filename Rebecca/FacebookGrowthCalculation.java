public class FacebookGrowthCalculation {
    public static void main(String[] args) {
        // Initial user base in billions
        double initialUsers = 1.0;

        // Target user bases
        double target1 = 1.5;
        double target2 = 2.0;

        // Monthly growth rate
        double growthRate = 0.04;

        // Calculate and display months to reach each target
        System.out.println("Months to reach 1.5 billion users: " + calculateMonths(initialUsers, target1, growthRate));
        System.out.println("Months to reach 2 billion users: " + calculateMonths(initialUsers, target2, growthRate));
    }

    // Simple method to calculate months needed to reach a target
    public static int calculateMonths(double start, double target, double rate) {
        int months = 0;
        while (start < target) {
            start += start * rate;
            months++;
        }
        return months;
    }
}

