
package chapter_10_assignment.payroll_system_modification;

public class SalaryEmployee extends Employee {
    private double weeklySalary;
    
    public SalaryEmployee(String firstName, String lastName, Date birthDate, double weeklySalary){
        super(firstName, lastName, birthDate);
        this.weeklySalary = weeklySalary;
    }
    @Override public double calculatePay(){
        return weeklySalary * 4;
    }
    
    
}
