
package L25_polimorphism_operator_instanceof;

public class numeric_promotion {
    public static void main(String[] args){
        int i = 5;
        long l = 10;
        
//        i = (int)(i * l);
//        same
//        i *= l;
        
        System.out.println(i + l);
        // Меньший тип конвертируется в больший тип
        
        float f = 3.14f;
        int i2 = 10;
        
        System.out.println(f + i2);
        // int ---> float
        
        byte b = 3;
        short s = 4;
        char c = 5;
        System.out.println(b + s + c); // ---> int
        System.out.println(b++); /// ---> остается byte
        
        byte b2 = 10;
        float f2 = 7;
        double d2 = 2.0;
        
        double i5 = b2 + f2 - d2;
        
        System.out.println(i5);
        
        double d10 = 3.14;
        float f10 = 6.28f;
        
        float f11 = 0 * 1.5f;
        float f12 = 0 * (float)1.5;
        
    }
}
