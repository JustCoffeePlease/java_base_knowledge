
package L15_while_do_wile;

public class Test1 {
    public static void main(String[] args){
        
        int i = 1;
        int j = 1;
        
        //Первый способ с for
        for(; i <= 10; i++){
            System.out.println(i);
        }
        //Второй способ с while
        while(j <= 10){
            System.out.println(j);
            j++;
        }
    }
}
