package polymorphisim_chapter10;

public class Animal{
    String name;
    int age;
    
    public void sound(){
        System.out.println("all animals make sounds: ");
    }
     public void sound(int numberOfTimes){
         for(int i = 1; i <= numberOfTimes; i++){
            sound();
         }
     }       
}
