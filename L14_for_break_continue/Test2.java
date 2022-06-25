
package L14_for_break_continue;

public class Test2 {
    public static void main(String[] args){
        for (int i = 5; i < 11; i++, abc(10)){
            System.out.println(i);
            abc(10);
        }
    }
    
    static void abc(int n){
        System.out.println(n);
    }
}
