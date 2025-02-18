package chapter_10_assignment.payroll_system_modification;

public class Car implements CarbonFootPrint {
    private double fuelEfficiency; // km per liter
    private double distanceTraveled; // km per year

    public Car(double fuelEfficiency, double distanceTraveled) {
        this.fuelEfficiency = fuelEfficiency;
        this.distanceTraveled = distanceTraveled;
    }

    @Override
    public double getCarbonFootPrint() {
        return (distanceTraveled / fuelEfficiency) * 2.31;
    }

    @Override
    public String toString() {
        return String.format("Car: Fuel Efficiency: %.2f km/L, Distance Traveled: %.2f km, Carbon Footprint: %.2f kg CO2",
                fuelEfficiency, distanceTraveled, getCarbonFootPrint());
    }
}
