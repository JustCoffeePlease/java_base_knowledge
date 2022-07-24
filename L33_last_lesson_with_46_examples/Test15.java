
package L33_last_lesson_with_46_examples;

public class Test15 {
    public static void main(String[] args) {
        boolean b = false;
        if(b){
            System.out.println("Hello1");
        }
        while(b){
            System.out.println("Buy1");
        }
        if(1 != 1){
            System.out.println("Hello2");
        }
//        while (1 != 1){                       | always False
//            System.out.println("Buy2");       | Unreachable statement
//        }
    }
}
