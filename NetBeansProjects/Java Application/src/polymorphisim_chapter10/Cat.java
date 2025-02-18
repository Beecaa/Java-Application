
package polymorphisim_chapter10;


public class Cat extends Animal {
    String color;
    
    @Override public void sound(){
        System.out.println("cat meow");
    }
}
