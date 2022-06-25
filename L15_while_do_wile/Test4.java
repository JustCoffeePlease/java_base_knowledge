
package L15_while_do_wile;

public class Test4 {
    public static void main(String[] args){
        
        int a = 5;
        
        while (++a < 10){ //Сначала получается 6
            a++;
        }
        System.out.println(a);
    }
}
