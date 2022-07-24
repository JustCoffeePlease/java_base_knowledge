
package L26_equals_toString_Wrapper_classes;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args){
        Car c1 = new Car("red", "V4");
        Car c2 = new Car("Black", "V6");
        Car c3 = new Car("White", "V8");
        
        ArrayList<Car> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        
        Car c4 = new Car("Black", "V6");
        
        System.out.println(list.contains(c4));
        
        System.out.println(c1.equals(c2));
        
        System.out.println(c1.toString());
        System.out.println(list);        
    }
}

class Car{
    String color;
    String engine;
    Car(String color, String engine){
        this.color = color;
        this.engine = engine;
    }
    
    public boolean equals(Object obj){
        if (obj instanceof Car){
            Car c2 = (Car) obj;
            return
            (color.equals(c2.color) && engine.equals(c2.engine));
        }
        else {
            return false;
        }
    }
    public String toString(){
        return "Car color " + color + " and engine " + engine;
    }
}