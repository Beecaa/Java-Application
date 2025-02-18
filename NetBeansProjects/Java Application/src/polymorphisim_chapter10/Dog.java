
package polymorphisim_chapter10;


public class Dog extends Animal{
    String breed;
    
    @Override public void sound(){
        System.out.println("Dag barks woof woof! ");
    }
    
}
