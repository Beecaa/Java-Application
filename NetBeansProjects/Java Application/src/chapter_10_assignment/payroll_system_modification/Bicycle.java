
package chapter_10_assignment.payroll_system_modification;

public class Bicycle implements CarbonFootPrint {
    @Override
    public double getCarbonFootPrint() {
        return 5.0; // Approximate annual carbon footprint of a bicycle
    }

    @Override
    public String toString() {
        return String.format("Bicycle: Carbon Footprint: %.2f kg CO2 (Minimal emissions)", getCarbonFootPrint());
    }
}
