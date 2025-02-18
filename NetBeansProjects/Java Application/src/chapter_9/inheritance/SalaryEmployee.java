package chapter_9.inheritance;

public class SalaryEmployee extends Employee {
    private double dailyWage = 5000.0;

    public SalaryEmployee(String employeeId, String firstName, String lastName, 
                          String socialSecurityNumber) {
        super(employeeId, firstName, lastName, socialSecurityNumber); // Fix constructor
    }

    public double getDailyWage() {
        return dailyWage;
    }        

    public void setDailyWage(double dailyWage) {
        this.dailyWage = dailyWage;
    }

    public double earnings() {
        return dailyWage * 20; // Assuming 20 workdays in a month
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\n%-15s: %.2f", "Daily Wage", dailyWage);
    }
}
