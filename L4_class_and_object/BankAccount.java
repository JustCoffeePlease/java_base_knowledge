
package L4_class_and_object;
// Любой класс это тип данных
public class BankAccount {
    
//    int id;
//    String name;
//    double balance;
    int id= 10;                             //
//    String name= "Andrew";                // DEFAULT PARAMETERS
    String name = new String("Andrew");     //
    double balance= 100;                    //
}

class BankAccountTest{
    
    public static void main(String[] args){
        
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();
        BankAccount NewAccount = new BankAccount();   
        
        MyAccount.id = 1;
        MyAccount.name = "Alex";
        MyAccount.balance = 12.35;
        
        YourAccount.id = 2;
        YourAccount.name = "Olesya";
        YourAccount.balance = 15.00;
        
        HisAccount.id = 3;
        HisAccount.name = "Egor";
        HisAccount.balance = 4.00;
        
        System.out.println(MyAccount.name);
        System.out.println(HisAccount.name);
        System.out.println(NewAccount.name);
    }
}
