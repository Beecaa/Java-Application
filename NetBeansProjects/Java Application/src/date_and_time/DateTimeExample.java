
package date_and_time;
import java.time.LocalDateTime;
import java.time.Month;
public class DateTimeExample {
    
    public static void main(String[] args) {
        LocalDateTime todaysDateTime = LocalDateTime.now();
        System.out.printf("%s%n", todaysDateTime);
        
        LocalDateTime appointmentTime = LocalDateTime.of(2007, Month.MARCH, 
                9, 22, 4);
        System.out.printf("%s%n",appointmentTime);
        
         String userDateTime = "2014-09-12";
         System.out.printf("%s%n", userDateTime);
    }
}
