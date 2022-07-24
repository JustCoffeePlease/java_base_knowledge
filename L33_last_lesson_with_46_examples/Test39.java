
package L33_last_lesson_with_46_examples;

public class Test39 {
    static int a= 3;
    static void abc(){
        int a = 5;
        def();
    }
    
    static void def(){
        a += 2;
        ghi(a);
        System.out.println(a);
    }
    
    static void ghi(int a){
        a -= 1;
    }
    
    public static void main(String[] args) {
        abc();
    }
}
