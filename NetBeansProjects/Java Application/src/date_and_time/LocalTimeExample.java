
package date_and_time;
import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime todaysTime = LocalTime.now();
        System.out.println(todaysTime);
        
        
        LocalTime appointmentTime = LocalTime.of(1,30,50,2637);
        System.out.println(appointmentTime);
        
        LocalTime userTime = LocalTime.parse("14:30:45");
        System.out.println(userTime);
        
        int hour = userTime.getHour();
        System.out.println(hour);
        
        int minutes = userTime.getMinute();
        System.out.println(minutes);
        
        int sec = userTime.getSecond();
        System.out.println(sec);
        
        LocalTime addHours = userTime.plusHours(2);
        System.out.println(addHours);
        
        boolean isBefore = LocalTime.now().isBefore(LocalTime.of(12, 0));
        System.out.println(isBefore);
        
         boolean isAfter = LocalTime.now().isBefore(LocalTime.of(12, 0));
        System.out.println(isAfter);
        
        String meetingTime = "14:30:57";
        String meetingTime1 = "07:30:56";
        
        LocalTime time = LocalTime.parse(meetingTime);
        LocalTime time1 = LocalTime.parse(meetingTime1);
        
        boolean isTimeEqual = time1.equals(meetingTime);
        System.out.println(isTimeEqual);
        
    }
}
