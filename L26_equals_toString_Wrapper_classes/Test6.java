
package L26_equals_toString_Wrapper_classes;

public class Test6 {
    int a = 3;
    Test6(){
        a = 4;
    }
    {
        a = 5;
    }
//    public static void main(String[] args){
//        Test6 t = new Test6();
//        System.out.println(t.a);
//    }
}

class A{
    static final int b;
    int a = 5;
    static {b = 10;}
}

class B{
    static int c;
    static final int d;
    static final int e = 1;
    static final int f;
    
    static {
        
        c = 5;
        d = 3;
//        e = 2;
        f = 0;
    }
}

class C{
    String c = "Ok";
    {System.out.println(c);}
    
    static int i = 0;
    static {System.out.println(i);}
    static {i = i + 1; System.out.println(i);}
    
    C(){System.out.println("This is constructor");}
    
    public static void main(String[] args){
        System.out.println("Hello everyBody");
        C c = new C();
    }
}

class D {

    static {abc(2);}
    static void abc(int a) {System.out.println(a + " ");}
    D() {abc(5);}
    static {abc(4);}
    {abc(6);}
    static {new D();}
    {abc(8);}
    
    public static void main(String[] args){}
}
