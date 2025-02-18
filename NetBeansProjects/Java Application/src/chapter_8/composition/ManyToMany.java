package chapter_8.composition;
import java.util.ArrayList;
import java.util.List;

public class ManyToMany {
    public static void main(String[] args) {
        // Create courses
        Course java = new Course("Java");
        Course python = new Course("Python");
        Course logic = new Course("Logic");
        Course sql = new Course("SQL");

        // Create students
        Student mario = new Student("Mario");
        Student becca = new Student("Becca");

        // Enroll students in courses
        java.enrollStudent(mario);
        java.enrollStudent(becca);
        python.enrollStudent(mario);
        sql.enrollStudent(becca);

        // Store courses in a mutable list
        List<Course> courses = new ArrayList<>();
        courses.add(java);
        courses.add(python);
        courses.add(logic);
        courses.add(sql);

        // Display student details
        mario.displayStudentDetails();
        becca.displayStudentDetails();

        // Display course details
        java.showStudents();
    }
}
