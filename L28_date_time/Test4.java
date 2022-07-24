
package L28_date_time;
import java.time.*; 
public class Test4 {
    static void change(LocalDate start, LocalDate end, Period p){
        LocalDate date = start;
        while(date.isBefore(end)){
            System.out.println("Date " + date + " to change the attendant");
            date = date.plus(p);
        }
    }
    public static void main(String[] args) {

        LocalDate start = LocalDate.of(2022, Month.JULY, 1);
        LocalDate end = LocalDate.of(2022, Month.NOVEMBER, 30);
//        Period p = Period.ofMonths(1);
//        Period p = Period.ofDays(100);
//        Period p = Period.ofWeeks(1);
        Period p = Period.of(1, 3, 15);

        change(start, end, p);
        
    }
}
