
package Lesson_5;

public class Car4 {
    
    Car4(String var_color, String var_engine){
        color = var_color;
        engine = var_engine;
        
        System.out.println("Car color is " + color);
        System.out.println("Car engine is " + engine);
    }
    
    String color;
    String engine;
}

class CarTest {
    
    public static void main(String[] args){
        
        Car4 car1 = new Car4("Black", "V8");
        
        Car4 car2 = new Car4("White", "V6");
    
    }
}