
package L12_if_if_else;

public class Car {
    
    int engine;
    int doors_count;
    
    Car(int engine, int doors_count){
    
        this.engine = engine;
        this.doors_count = doors_count;
    }
}

class CarTest{

    public static void main(String[] args){
    
        Car c1 = new Car(3, 4);
        Car c2 = new Car(2, 5);
        
        if (c1.engine > c2.engine){
        
            if (c1.doors_count > c2.doors_count)
                System.out.println("Car #1 is better");
            else {
                System.out.println("Car #2 is better");
            }
        }
        else{
          System.out.println("Pam pam");      
         }
    }
}