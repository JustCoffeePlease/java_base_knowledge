
package Homework.Homework11;


public class Car {
    
    public String color;
    public String engine;
    public int doors_count;
    public static int count;
    
    Car(String color, String engine, int doors_count){
    
        this.color = color;
        this.engine = engine;
        this.doors_count = doors_count;
        count++;
        
        System.out.println("Car number " + count + " is created");
        System.out.println("Car_" + count + ": color is " + color);
        System.out.println("Car_" + count + ": engine is " + engine);
        System.out.println("Car_" + count + ": doors count is " + doors_count);
        System.out.println();
        
    }
}

class CarTest {
    
    public static void update_doors_count(Car object, int new_doors_count){
    
        object.doors_count = new_doors_count;
        
        System.out.println("New doors count is: " + object.doors_count);
    }
    
    public static void swap_color(Car object1, Car object2){
    
        String service_color = object1.color;
        object1.color = object2.color;
        object2.color = service_color;
        
        System.out.println("Color swapping is completed");
        System.out.println();
    }
    
    public static void main(String[] args){
    
        Car car_1 = new Car("White", "V8", 5);
        Car car_2 = new Car("Black", "V6", 3);
        
        update_doors_count(car_1, 3);
        swap_color(car_1, car_2);
        
        System.out.println("Car_1: color is " + car_1.color);
        System.out.println("Car_1: doors count is " + car_1.doors_count);
        System.out.println();
        System.out.println("Car_2: color is " + car_2.color);
        System.out.println("Car_2: doors count is " + car_2.doors_count);
    }
}
