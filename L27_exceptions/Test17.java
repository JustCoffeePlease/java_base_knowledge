
package L27_exceptions;

public class Test17 {
//    static {
//    int a = Integer.parseInt("12e");
//    }
    
//    static String s = null;
//    static int a = s.length();
    
    static String s = abc();
    
    static String abc(){
        String [] array = {"1", "2", "3"};
        return array[100];
    }
    
    public static void main(String[] args){}
}
