
package chapter_10_assignment.payroll_system_modification;

import java.util.ArrayList;

public class CarbonFootPrintTest {
    public static void main(String[] args) {
        ArrayList<CarbonFootPrint> objects = new ArrayList<>();

        // Adding different objects to the list
        objects.add(new Building(5000, 1000));  // 5000 kWh, 1000 liters fuel
        objects.add(new Car(15, 20000));       // 15 km/L, 20000 km/year
        objects.add(new Bicycle());            // Bicycle

        // Iterating through the list and printing details
        for (CarbonFootPrint obj : objects) {
            System.out.println(obj.toString());
            System.out.println("----------------------------------");
        }
    }
}
