
package chapter_10_assignment.payroll_system_modification;


public class PayrollSystemTest {

    public static void main(String[] args) {
        // Creating an array of Employee references
        Employeee[] employees = new Employeee[2];

        // Adding instances of different Employee types
        employees[0] = new PieceWorker("Alice", "Johnson", "123-45-6789", 10.5, 120);
        employees[1] = new SalariedEmployee("Bob", "Smith", "987-65-4321", 800);

        // Display information and earnings for each Employee
        for (Employeee emp : employees) {
            System.out.println(emp.toString());
            System.out.println("----------------------------------");
        }
    }
}


