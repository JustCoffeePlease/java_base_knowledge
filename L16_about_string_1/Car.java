
package L16_about_string_1;


public class Car {
    String color;
    String engine;
    
    Car(String color, String engiine){
        this.color = color;
        this.engine = engine;
    }
    
    final static int a = 5;
   
//        a = 10; // Невозможно изменить переменную, так как она задада с модификатором final
    
    public Car abc(String color_){
        Car c10 = new Car(color_, "V4");
        
        return c10;
    }
    public static void main(String[] args){
        Car c = new Car("Red", "V6");
        Car c2 = c.abc("black");
        System.out.println(c.color); // Возвращает red
    }
}

//class TestCar{
//    final static Car c = new Car("red", "V8");
//    
//    public static void main(String[] args){
////        c = new Car("red", "V6"); // Невозможно назначить новое значение c
//        c.color = "black";
//    } 
//}

