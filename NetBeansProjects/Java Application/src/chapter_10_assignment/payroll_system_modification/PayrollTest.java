package chapter_10_assignment.payroll_system_modification;
import java.util.Calendar;

public class PayrollTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3]; // Example array size

        // Sample Employee Data (replace with your actual data)
        employees[0] = new SalaryEmployee("Bob: ","Marley: ", new Date(12, 01, 1990), 1000);
        System.out.println(employees[0]);
        
        employees[1] = new SalaryEmployee("clinton: ","Chibota: ", new Date(12, 11, 1990), 1000);
        System.out.println(employees[1]);
        
        employees[2] = new SalaryEmployee("Charlie: ", "Smart: ",new Date(7, 9, 1980), 900);
        System.out.println(employees[2]);
         Calendar cal = Calendar.getInstance();
        int currentMonth = cal.get(Calendar.MONTH) + 1; // Calendar month is 0-indexed

        currentMonth = 9;
        for (Employee emp : employees) {
            double pay = emp.calculatePay();
            if (emp.getdateBirth().getmonth() == currentMonth) {
                pay += 100; // Adding bonus
            }
            System.out.println("Employee: " + emp.getfirstName() + ", Pay: $" + pay);
        }
    }
}
    
