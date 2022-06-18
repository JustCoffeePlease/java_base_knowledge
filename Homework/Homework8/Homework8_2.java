
package Homework.Homework8;

public class Homework8_2 {
    //Переменные 
    static final double pi = 3.14;
    
    // Методы
    public double area_of_a_circle(double radius){
        double s = pi * radius * radius;
        return s;
    }
    
    public static double perimeter_of_a_circle(double radius){
        double p = 2 * pi * radius;
        return p;
    }
    
    public void info_of_circle(double radius){
        double area = area_of_a_circle(radius);
        double perimeter = perimeter_of_a_circle(radius);
        System.out.println("Area of circle is: " + area);
        System.out.println("Perimeter of circle is: " + perimeter);
    }
}
class Homework8_2Test{
        public static void main(String[] args){
            Homework8_2 x1 = new Homework8_2();
            System.out.println(x1.area_of_a_circle(2.0));
            System.out.println(x1.perimeter_of_a_circle(2.0));
            x1.info_of_circle(2.0);
        }
}
