package date_and_time;
import java.time.LocalDate;
import java.time.Month;


public class LocalDateExample {
    public static void main(String[] args){
        LocalDate todayDate = LocalDate.now();
        System.out.println(todayDate);
        
        LocalDate date = LocalDate.of(2025, 2,6);
        System.out.println(date);
        
        String dOB = "2000-06-20";
        LocalDate dateBirth = LocalDate.parse(dOB);
        System.out.println(dateBirth);
        
         boolean checkDate = dateBirth.isLeapYear();
        System.out.printf("%b%n",checkDate);
       
       int  birthYear = LocalDate.parse(dOB).getYear();
        System.out.printf("your birth year is %d",birthYear);
        
        Month  birthMonth = LocalDate.parse(dOB).getMonth();
        System.out.printf("your birth month is %d",birthMonth);
         
        
         int  birthday = LocalDate.parse(dOB).getDayOfMonth();
        System.out.printf("your birth day is %d",birthday);
        
        String birthDay1 = "2023-09-17";
        String birthDay2 = "2015-06-16";
        LocalDate date1 = LocalDate.parse(birthDay1);
        LocalDate date2 = LocalDate.parse(birthDay2);
        
        
        
    }
    
}