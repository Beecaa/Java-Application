
package composition;


public class OneToOneAssociation {
    public static void main(String[] args) {
        Address address1 = new Address("No 3 new woji layout", 
        "Port Harcourt", "Rivers State", "Nigeria");
        Person person1 = new Person("swingle", address1);
        person1.displayPerson();
        System.out.println();
        
        Address address2 = new Address("No 1 Clinton Avenue", 
        "Port Harcourt", "Alabama", "USA");
        Person person2 = new Person("Udo-Kalu", address2);
        person2.displayPerson();
        
        System.out.println();
    }
}
