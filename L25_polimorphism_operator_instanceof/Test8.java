
package L25_polimorphism_operator_instanceof;

public class Test8 {
    
}

class Test1 implements interface1, interface2{
    public void abc(){System.out.println("Ok");}
    public static void main(String[] args){
        Test1 t = new Test1();
        System.out.println(((interface1)t).a);
        ((interface1) t).abc();
    }
}

interface interface1{
    int a = 5;
    void abc();
}

interface interface2{
    int a = 10;
    void abc();
}