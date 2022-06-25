
package Homework.Homework14;

public class Time {
    
    public static void PrintTime(){
        HOUR: for (int hour = 0; hour <= 6; hour++){
            MINUTE: for (int minute = 0; minute <= 59; minute++){
                SECOND: for (int second = 0;  second <= 59; second++){
                    System.out.println(hour + ":" + minute + ":" + second);
                    
                    if (hour > 1 && minute % 10 == 0 && minute != 0){
                        break HOUR;}
                    
                    if (second * hour > minute){
                        continue MINUTE;}
                }
            }
        }
    }
}

class TimeTest {
    
    public static void main(String[] args){
        Time t1 = new Time();
        t1.PrintTime();        
    }
}
