
package chapter_10_assignment.payroll_system_modification;


public abstract class Employee {
    private String firstName;
    private String lastName;
    private Date birthDate;
    
    public Employee(String firstName, String lastName, Date birthDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }
    public String getfirstName(){
        return firstName;
    }
    public Date getdateBirth(){
        return birthDate;
    }
    @Override public String toString(){
        return "Firstname: " +firstName + "Lastname: " + lastName + "Birthdate: " + birthDate;
    }
    public abstract double calculatePay();
}
