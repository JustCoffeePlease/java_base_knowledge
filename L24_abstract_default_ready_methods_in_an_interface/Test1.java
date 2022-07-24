
package L24_abstract_default_ready_methods_in_an_interface;

public class Test1 {
    public final static void main(String[] args){
    // ѕри такой записи невозможен overriding и hiding метода main
    }
}

class A{
    String s = "Hello";
    void abc(){
        System.out.println("???");
    }
}
class B extends A{
    String s = "Goodbue";
    void abc(){
        System.out.println("!!!");
    }
}
class C extends B{
    public static void main(String[] args){
        C c = new C();
        c.abc();
        System.out.println(c.s);
    }
}