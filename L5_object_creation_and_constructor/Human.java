
package L5_object_creation_and_constructor;


public class Human {
    String name;
    Car car;
    BankAccount bA;
    
    void info(){
        System.out.println("Name: " + name + "; Car color: " + car.color + "; Bank score balacnce " + bA.balance);
    }
}

    class HumanTest{
        
        public static void main(String[] args){
            Human h = new Human();
            h.name = "David";
            h.car = new Car("Red", "V8");
            h.bA = new BankAccount(18, 200.5);
            
            h.info();
        }
    
    }

class Car{
    Car(String c, String e){
        color = c;
        engine = e;
}
    String color;
    String engine;
}

class BankAccount{
    BankAccount(int id2, double balance2){
    id = id2;
    balance = balance2;
    }
    int id;
    double balance;
}