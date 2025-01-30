
package chapter7;


public class Student {
    
    int studentId = 101;
    String firstName = "John";
    String lastName = "Williams";
    String gender = "Male";
    int age = 25;
    
    public void study(){
        System.out.println("List of courses.......");
        System.out.println("Java");
        System.out.println("Web dev");
        System.out.println("Mobile App");
    }
    
    public void display(){
        System.out.println("Student ID: " + studentId);
        System.out.println("Student first name: " + firstName);
        System.out.println("Student Last name: " + lastName);
        System.out.println("Student Gender: " + gender);
        System.out.println("Student age: " + age);
        
        study();
    }
}

