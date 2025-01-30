
package Person;


public class Person {
    private String lastName;
    private String firstName;
    private int age;
    private String country;
    
     public Person(String lastName, String firstName,int age, String country) {
        this.lastName = lastName;
        this.age = age;
        this.firstName = firstName;
        this.country = country;
    
}

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }
public void display(){
        System.out.printf("Last Name : %s%n", getLastName());
        System.out.printf("FirstName : %s%n", getFirstName());
        System.out.printf("Country : %s%n", getCountry());
        System.out.printf("Age : %d%n", getAge());
}
}
