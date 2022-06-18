
package Lesson_4;


public class Car {
    
    String color = "red";
    String engine = "V6";
    
}

class CarTest{
    
    public static void main(String[] args){
        
        int a;
        Car car1 = new Car();
            car1.color = "black";
            car1.engine = "V8";
        Car car2 = new Car();
        
        Car car3 = car1;
        
        Car car4;
        
//        System.out.println(car3.engine);
//        System.out.println(new Car().color);
        
//        System.out.print("Color: ");
//        System.out.println(car1.color);
//        System.out.print("Engine: ");
//        System.out.println(car1.engine);

//        USING STRING CONCATENATION
        System.out.println("Color is " + car1.color);
        System.out.println("Type of engine is " + car1.engine);
    }
}
