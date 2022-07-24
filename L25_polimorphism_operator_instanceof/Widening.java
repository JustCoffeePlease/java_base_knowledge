
package L25_polimorphism_operator_instanceof;

public class Widening {
    public static void main(String[] args){
        byte b = 10;
        int a = b;
        System.out.println(7);
        
        int i1 = 3;
        short s2 = (short)i1;
        
        byte b2 = 3;
        short s1 = -6;
        char c1 = 100;
        
        int i10 = 111111;
        short s10 = (short) i10;
        System.out.println(s10);
        
        char c10 = (char)-8;
        System.out.println(c10);
        
        double d = 56565656.56;
        byte b12 = (byte)d;
        System.out.println(b12);      
        
        System.out.println("-------------------------------------------------");       
        int i = 2147483647;
            System.out.println(i + 1);
    }
}
