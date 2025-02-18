
package chapter_10_assignment.payroll_system_modification;

public class Date {
    private int day;
    private int month;
    private int year;
    
    public Date(int day, int month,int year){
    this.day = day;
    this.month = month;
    this.year = year;
}
public int getday(){
    return day;
}
public int getmonth(){
    return month;
}
public int getyear(){
    return year;
}
@Override public String toString(){
    return day +"/" + month + "/" + year;
}
}
