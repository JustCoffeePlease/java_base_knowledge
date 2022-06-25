
package Homework.Homework15;

public class Time15FromZaur {
    
    public static void Printtime(){
        
        int hour = 0;
        
        OUTER:
        while (hour < 6){
            int minute = -1;
            
            MIDDLE:
            do{
                minute++;
                
                if (hour > 1 && minute % 10 == 0){
                    break OUTER;
                }
                
                int second = 0;
                
                INNER:
                while (second < 60){
                    if (second * hour > minute){
                        continue MIDDLE;
                    }
                    System.out.println(hour + ":" + minute + ":" + second);
                    second++;
                }
            }
            while (minute < 59);
            hour ++; // Не относится к while (minute < 59)
        }
    }
    public static void main(String[] args){
        Printtime();
    }
}
