package chapter_8.composition;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<Student> students; // List of students enrolled in this course
    
    // Constructor initializes with an empty student list
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    // Method to get course name
    public String displayCourse() {
        return courseName;
    }
    
    // Method to enroll a student
    public void enrollStudent(Student student) {
        students.add(student);
        student.enrollInCourse(this); // Ensuring bidirectional relationship
    }

    // Method to display students in this course
    public void showStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }

    Object[] displaycourse() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
