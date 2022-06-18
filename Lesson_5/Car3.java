
package Lesson_5;

public class Car3 {
    // Создание своего конструктора
    // По default он пустой
//    Car3(){}
    
    // Можно создавать значения переменных по default
//    Car3(){
//    color = "blue";
//    engine = "V12"
//    }
    Car3(String var_color, String var_engine){
        color = var_color;
        engine = var_engine;
        System.out.println("Car is created");
    }
    
    String color, engine;
    int speed;
    
    int gaz(int scor){
        speed += scor;
        return speed;
    }
    
    int stop(int scor){
        speed -= scor;
        return speed;
    }
    // void когда метод ничего не возвращает
    void ShowInfo(){
        System.out.println("Color is " + color);
        System.out.println("Engine is " + engine);
        System.out.println("Speed is " + speed);  
    }
}

class Car2Test{
    public static void main(String[] args){
        Car3 car = new Car3("Yellow", "V4");
        System.out.println(car.color); // Если не задано
                                            //значение default, то null
        System.out.println(car.engine);
    }
}
