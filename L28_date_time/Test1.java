
package L28_date_time;

import java.time.*;

public class Test1 {
    public static void main(String[] args) {
//        System.out.println(LocalDate.now());
//        System.out.println(LocalTime.now());
//        System.out.println(LocalDateTime.now());

//        LocalDate ld = LocalDate(2022, 07, 14); // Error because LocalDate is private class
        LocalDate ld1 = LocalDate.of(2022, 9, 9);
        System.out.println(ld1);
        LocalDate ld2 = LocalDate.of(2022, Month.SEPTEMBER, 9);
        System.out.println(ld2);
        
        LocalTime lt1 = LocalTime.of(15, 30);
        System.out.println(lt1);
        LocalTime lt2 = LocalTime.of(15, 30, 45, 999999999);
        System.out.println(lt2);
        
        LocalDateTime ldt1 = LocalDateTime.of(2022, 9, 10, 17, 20);
        System.out.println(ldt1);
        LocalDateTime ldt2 = LocalDateTime.of(2022, 9, 10, 17, 20, 18);
        System.out.println(ldt2);
        LocalDateTime ldt3 = LocalDateTime.of(2022, 9, 10, 17, 20, 18, 999);
        System.out.println(ldt3);    
        
        LocalDateTime ldt4 = LocalDateTime.of(ld1, lt1);
        System.out.println(ldt4);
        
        System.out.println("------------------------------------------------------");
        
        LocalDate ld10 = ld1.plusDays(5);
        System.out.println(ld10);
        ld1 = ld1.plusDays(5);
        System.out.println(ld1);
        ld1 = ld1.minusDays(5);
        System.out.println(ld1);
        ld1 = ld1.plusWeeks(3);
        System.out.println(ld1);
        ld1 = ld1.minusMonths(5);
        System.out.println(ld1);
        ld1 = ld1.plusYears(3);
        System.out.println(ld1);
        
        System.out.println("------------------------------------------------------");
        
        
        LocalTime lt10 = LocalTime.of(15, 30);
        lt10 = lt10.plusHours(1);
        lt10 = lt10.minusMinutes(15);
        lt10 = lt10.plusNanos(15);
        
        lt10 = lt10.plusHours(1).minusMinutes(15).plusNanos(15);
        
        System.out.println(lt10);
        
        System.out.println("Тоже самое с LocalDateTime");
        
    }
}
