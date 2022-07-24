
package L28_date_time;
import java.time.*;
public class Test5 {

    public static void main(String[] args) {

        LocalDateTime start = LocalDateTime.of(2022, Month.JULY, 1, 16, 40);
//        Period p = Period.ofMonths(3).ofDays(10);
        Period p = Period.ofMonths(3);
        p = Period.ofDays(10);
        System.out.println(start.plus(p));
        
        System.out.println("--------------------------------------------------");

        LocalDateTime ldt = LocalDateTime.of(2022, Month.JULY, 1, 16, 40);       
        LocalTime lt = LocalTime.of(10, 30);
        
        Duration d = Duration.ofHours(3);
        
        System.out.println(lt.plus(d));        
        System.out.println(ldt.plus(d).plus(p));
    }    
}
