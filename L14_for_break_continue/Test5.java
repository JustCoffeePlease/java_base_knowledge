
package L14_for_break_continue;

public class Test5 {
    public static void main(String[] args){
        for (int i = 1; i <= 10; i++){
            if (i == 7) {
//                break;
                continue;// пропускает значение i == 7
            }
            if (i % 55 == 0){
                break;}
            System.out.println(i);
        }
    }
}
