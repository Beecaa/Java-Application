
package chapter_8.composition;
import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    List<Course>courses;
    
    public Student(String name,List<Course>courses){
        this.name = name;
        this.courses = courses;
       
    }

    Student(String mario) {
        this.name = name;
    this.courses = new ArrayList<>();
}
    public void displayStudentDetails(){
        System.out.printf("%s enrolled in the following courses %n", 
                name);
        for (Course course: courses){
            System.out.printf("%s", course.displaycourse());
        }
    }

    void enrollInCourse(Course aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
