
package polymorphisim_chapter10;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();
        
        Dog dog = new Dog();
        dog.sound(5);
        
        Cat cat = new Cat();
        cat.sound();
        
        Cow cow = new Cow();
        cow.sound();
        
    }
}
