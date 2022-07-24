
package L28_date_time;

import java.time.*;
import java.time.format.*;

public class Test6 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2022, Month.JULY, 17);
        LocalDateTime ldt = LocalDateTime.of(2022, Month.JULY, 17, 18, 31);
        
//        System.out.println(ld.getDayOfWeek());
        System.out.println(ldt.getDayOfWeek());
        System.out.println(ldt.getDayOfMonth());
        System.out.println(ldt.getDayOfYear());
        System.out.println(ldt.getMonth());
        System.out.println(ldt.getMonthValue());
        System.out.println(ldt.getYear());
        
        System.out.println("----------------------------------------------------");
        
        LocalTime lt = LocalTime.of(18, 36);
        System.out.println(lt.getNano());
        System.out.println(lt.getSecond());
        System.out.println(lt.getMinute());
        System.out.println(lt.getHour());

        System.out.println("----------------------------------------------------");

        DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(ld);
        System.out.println(ld.format(d1));

        System.out.println("----------------------------------------------------");
        
//        DateTimeFormatter d2 = DateTimeFormatter.ISO_LOCAL_TIME;
        System.out.println(lt);
//        System.out.println(lt.format(d2));
        System.out.println(lt.format(DateTimeFormatter.ISO_LOCAL_TIME));
        
        System.out.println("----------------------------------------------------");
        
        DateTimeFormatter d3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println(ldt);
        System.out.println(ldt.format(d3));        
        
        System.out.println("----------------------------------------------------");
        
        DateTimeFormatter d4 = DateTimeFormatter.ISO_WEEK_DATE;
        System.out.println(ld);
        System.out.println(ld.format(d4));
        
        System.out.println("----------------------------------------------------");
        
        DateTimeFormatter short_format = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(ldt);
        System.out.println(ldt.format(short_format));
        // Аналогичная запись
        System.out.println(short_format.format(ldt));

        System.out.println("----------------------------------------------------");
        // CREATE OWN FORMATTER
        
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MMMM, yyyy, hh:mm");
        System.out.println(ldt);
        System.out.println(ldt.format(f));
        
        System.out.println("----------------------------------------------------");
        // METHOD PARSE

        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd MMMM, yyyy");
        System.out.println(ldt.format(f2));
        
        LocalDate date1 = LocalDate.parse("17 июля, 2022", f2);
        System.out.println(date1);
        
        LocalDate date2 = LocalDate.parse("2022-07-17");
        System.out.println(date2);        
        
    }
}
