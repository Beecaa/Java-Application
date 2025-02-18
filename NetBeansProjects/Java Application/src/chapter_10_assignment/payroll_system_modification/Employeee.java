package chapter_10_assignment.payroll_system_modification;

public abstract class Employeee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employeee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = ssn;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getSSN() { return socialSecurityNumber; }

    public abstract double earnings(); // Abstract method

    @Override
    public String toString() {
        return String.format("%s %s\nSSN: %s", firstName, lastName, socialSecurityNumber);
    }
}
