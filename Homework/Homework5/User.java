

package Homework.Homework5;

public class User {
    String name;
    Car car;
    BankAccount bA;
    
    void info(){
        System.out.println("Name: " + name + "; Car color: " + car.color + "; Bank score balacnce " + bA.balance);
    }
}

    class UserTest{
        
        public static void main(String[] args){
            User h = new User();
            h.name = "David";
            h.car = new Car("Red", "V8");
            h.bA = new BankAccount(18, 200.5);
            
            h.info();
            h.bA.Withdrawals(15);
            h.bA.Refil(50);
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
    
    double Withdrawals(double wi_summ){
        double result = balance - wi_summ;
        System.out.println("Current balance: " + result);
        return result;
    }
    
    double Refil(double re_summ){
        double re_result = balance + re_summ;
        System.out.println("Current balance: " + re_result);
        return re_result;
    
    }
}

