
package L22_encapsulation_super_protrcted;

public class Test3 {}

class Human2 {
    Human2(String n){
        this(n, null);
    }
    Human2(String n, String s){
        name = n;
        surname = s;
    }
    String name;
    String surname;
}

class Student2 extends Human2{
    Student2(int i){
        super("Yoko"); // Означает обращение к предку
    }
    Student2(){
        this(5);
        System.out.println("Hello");
    }
    // Когда создается объект child класса, вызывается конструктор child класса, внутри которого вызывается конструктор parent класса
    public static void main(String[] args){
        Student2 s = new Student2();
    }
}