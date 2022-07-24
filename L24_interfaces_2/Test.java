
package L24_interfaces_2;

public class Test {
    
}

interface I1{
    // Пока нетprivate, подразумаевается, что метод public
    private static void method_1(){
        System.out.println("Static method");
    }
    
//    static void method_2(){
//        System.out.println("Static method");
//    }
    private void method_2(){
        System.out.println("Non-static method");
    }
    
    default void method_3(){
        method_1();
    }
    
    static void method_4(){
        method_1();
    }
}