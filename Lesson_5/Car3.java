
package Lesson_5;

public class Car3 {
    // �������� ������ ������������
    // �� default �� ������
//    Car3(){}
    
    // ����� ��������� �������� ���������� �� default
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
    // void ����� ����� ������ �� ����������
    void ShowInfo(){
        System.out.println("Color is " + color);
        System.out.println("Engine is " + engine);
        System.out.println("Speed is " + speed);  
    }
}

class Car2Test{
    public static void main(String[] args){
        Car3 car = new Car3("Yellow", "V4");
        System.out.println(car.color); // ���� �� ������
                                            //�������� default, �� null
        System.out.println(car.engine);
    }
}
