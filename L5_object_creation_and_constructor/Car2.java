
package L5_object_creation_and_constructor;


public class Car2 {
    
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
    
    void ShowInfo(){
        System.out.println("Color is " + color);
        System.out.println("Engine is " + engine);
        System.out.println("Speed is " + speed);  
    }
}

class Car2Test{
    public static void main(String[] args){
        Car2 c1 = new Car2();
        c1.color = "White";
        c1.engine = "V6";
        c1.speed = 60;
         
        c1.ShowInfo();
        c1.gaz(20);
        c1.stop(80);
        c1.ShowInfo();
        
    }
}