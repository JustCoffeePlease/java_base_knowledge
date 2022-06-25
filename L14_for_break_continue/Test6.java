
package L14_for_break_continue;

public class Test6 {
    public void time(){
        OUTER: for (int hour = 0; hour <= 23; hour++){
            System.out.println("Outer loop start");
            INNER: for (int minute = 0; minute <= 59; minute++){
                System.out.println(hour + ":" + minute);
                
//                if (minute == 30){break;} Выходит из inner loop
//                if (minute == 30){break OUTER;} // Выходит из outer loop
            }
            System.out.println("Outer loop end"); 
        }
    }
    public static void main(String[] args){
        Test6 t = new Test6();
        t.time();
    }
}