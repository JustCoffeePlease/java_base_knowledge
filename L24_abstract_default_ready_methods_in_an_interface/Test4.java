
package L24_abstract_default_ready_methods_in_an_interface;

public class Test4 {
    Jumpable j1 = new Human();
    Jumpable j2 = new Animal();
}

class Human implements Jumpable{
    public void jump(){
        System.out.println("Human jumps");
    }
}
class Animal implements Jumpable{
    public void jump(){
        System.out.println("Human jumps");
    }
}

interface Jumpable{}

interface A2{void abc();}
interface B2 extends A2, Jumpable{void def();}

//abstract class D implements A2, B2{}
// same as
abstract class D implements B2{}
