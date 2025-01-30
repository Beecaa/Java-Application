
package Person;


public class TestPerson {
    public static void main(String[] args){
        
        Person person = new Person("Swingle", "Becca", 25, "united states");
        
        person.display();
        
        Person person2 = new Person("Okoro", "chinaza", 15, "Nigeria");
        person2.display();
        
        Person person3 = new Person("Issac", "Benjamin", 45, "Kenya");
        person3.display();
        
    }
    
}
