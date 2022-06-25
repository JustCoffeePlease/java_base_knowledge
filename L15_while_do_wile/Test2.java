
package L15_while_do_wile;

public class Test2 {
    
    public static void main(String[] args){
        
        int money = 100;
        
        while (money > 0){
            System.out.println("Place your bet");
            System.out.println("You lost");
            money = money - 10;
        }
    }
}
