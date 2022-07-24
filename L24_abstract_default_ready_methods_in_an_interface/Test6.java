
package L24_abstract_default_ready_methods_in_an_interface;

public class Test6 {
    
}

interface I1 {

   default void abc(){
       System.out.println("This is 'abc' method ");
   }
   static void def(){
       System.out.println("This is static method 1");
   }
}

interface I2{ // extends I1{
//    void abc();
    static void def(){
       System.out.println("This is static method 2");
   }
}

abstract class R implements I1{
    public void abc(){
        System.out.println("This is 'abc' method from R class");
    }
}

 class U implements I1, I2{
     public static void main(String[] args){
         I1.def();
         I2.def();
     }
 }
