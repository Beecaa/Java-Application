
package chapter_9.inheritance;


public class Employee {
    private final String employeeId;
    private String firstName;
    private String lastName;
    private final String socialSecurityNumber;
    
    public Employee(String employeeId, String firstName, String lastName, String socialSecurityNumber){
        this .employeeId = employeeId;
        this .firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;            
    }
    public String getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

   public void setfirstName(String firstName){
       this.firstName = firstName;
   }
   
   public String getlastName(){
       return lastName;
   }

   public void setlastName(String lastName){
       this.lastName = lastName;
   }
   
   public String getsocialSecurityNumber(){
       return socialSecurityNumber;
   }
   @Override public String toString(){
       return String.format("%-15s: %-25s%n%-15s: %-25s%n%-15s: %-25s%n","Employee Details", employeeId,
       firstName,lastName,"Social Security Number",socialSecurityNumber);
   }
}
   

   


 