
package Homework.Homework8;


public class Homework8_1 {
    
    public static double multiply(double a, double b, double c){
        double result = a * b * c;
        return result;
    }
    
    public static void division(double a1, double b1){
        double result = a1 / b1;
        System.out.println(result);
    }
    
    public static void main(String[] args){
       // Using first method
       double x = multiply(2.0, 2.0, 2.0);
       System.out.println(x);
       // Using srcond method
       division(8.0, 4.0);
       
    }
}