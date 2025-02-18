
package chapter_10_assignment.payroll_system_modification;


public class Building implements CarbonFootPrint{
    private double electricityUsage;
    private double fuelConsumption;
    
    public Building(double electricityUsage, double fuelConsumption){
        this.electricityUsage = electricityUsage;
        this.fuelConsumption = fuelConsumption;
    }
    @Override public double getCarbonFootPrint(){
        return(electricityUsage*0.92)+(fuelConsumption*2.31);
        
    }
    @Override public String toString(){
        return String.format("Building: Electricity Used: %.2f kwh, Fuel Used: %.2f liters, "
                + "Carbon Footprint: %.2f kg CO2", 
                electricityUsage,fuelConsumption,getCarbonFootPrint());
    }
}
