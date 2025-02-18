package chapter_10_assignment.payroll_system_modification;

public class SalariedEmployee extends Employeee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String ssn, double salary) {
        super(firstName, lastName, ssn);
        this.weeklySalary = salary;
    }

    @Override
    public double earnings() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return String.format("Salaried Employee: %s\nWeekly Salary: $%.2f\nEarnings: $%.2f",
                super.toString(), weeklySalary, earnings());
    }
}
