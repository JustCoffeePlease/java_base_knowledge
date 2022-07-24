
package L28_date_time;

import java.time.*;

public class Test3 {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2014, Month.MAY, 31);
        LocalDate ld2 = LocalDate.of(2020, Month.JUNE, 21);
        System.out.println(ld1.isBefore(ld2));
        
        LocalTime lt1 = LocalTime.of(15, 30);
        LocalTime lt2 = LocalTime.of(03, 5, 18, 55598);
        System.out.println(lt1.isAfter(lt2));
        
        LocalDateTime ldt1 = LocalDateTime.of(2022, 06, 10, 17, 28);
        LocalDateTime ldt2 = LocalDateTime.of(2022, 06, 10, 17, 21);
        System.out.println(ldt1.isBefore(ldt2));
        System.out.println(ldt1.isAfter(ldt2));
        
//        System.out.println(ld1.isAfter(lt2)); // Error
    }
        
}
