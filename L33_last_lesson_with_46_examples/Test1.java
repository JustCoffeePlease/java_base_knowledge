
package L33_last_lesson_with_46_examples;

public class Test1 {
    
}

class B extends A{
    public int a = 20;
    public void abc(){
        System.out.println("child non-static");
    }
    public static void abc2(){
        System.out.println("child static");
    }
    
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.a);            //Output: 20
        System.out.println(((A)b).a);       //Output: 10
        b.abc();                            //Output: child non-static
        ((A)b).abc();                       //Output: base non-static
        b.abc2();                           //Output: child static
        ((A)b).abc2();                      //Output: base static
    }
    
}

class A{
    public int a = 10;
    public void abc(){
        System.out.println("base non-static");
    }
    public static void abc2(){
        System.out.println("base static");
    }
}