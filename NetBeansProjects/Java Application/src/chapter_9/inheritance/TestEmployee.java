package chapter_9.inheritance;

public class TestEmployee {
    
    public static void main(String[] args) {
        SalaryEmployee salaryEmployee = new SalaryEmployee("1041", "Anthony", "Franklin",
                "123-45-6789");
        
        System.out.println("Salary Employee Details:");
        System.out.println(salaryEmployee);
        System.out.printf("%-15s: $%.2f%n%n", "Earnings", salaryEmployee.earnings());

        // Create BasePlusCommissionEmployee object
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
            "456", "Jane", "Smith", "987-65-4321", 
                7000.0, 0.12, 2000.0);

        System.out.println("BasePlusCommissionEmployee Details:");
        
        
        System.out.printf("%-15s: $%.2f%n%n", "Earnings", employee.earnings());

        
        System.out.println("\nEarnings: $" + employee.earnings());
    }
}
