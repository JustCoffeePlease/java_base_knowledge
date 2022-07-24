
package L27_exceptions;
import java.util.*;
public class Test16 {
    public static void main(String[] args){
//        ArrayList <String> list = new ArrayList<>();
//        list.add("1");
//        list.add("2");
//            System.out.println(list.get(3));
//        System.out.println(5/0);

//Doctor d = new Doctor();
//Teacher t = new Teacher();
//Teacher t3 = new Teacher();
//
//
//Employee [] array1 = {d, t};
//Teacher [] array2 = {t, t3};
//
////Teacher t2 = (Teacher)array1[0];
////Doctor d2 = (Doctor)array2[0];
        createPwd("qwerty");
    }
    
    public static void createPwd(String pwd){
        if(pwd.length() < 6){
            throw new IllegalArgumentException("Password length is too small");
        }
        if(pwd.length() < 12){
            throw new IllegalArgumentException("Password length is too long");
        }
        else{
            System.out.println("Password accepted");
        }
    }
}

class Employee{}
class Doctor extends Employee{}
class Teacher extends Employee{}

class Plane{
    String status = "Waiting"; // "Waiting for fly", "Flight canceled"
    
    public void fly(){
        System.out.println("Plane is flying");
    }
    
    public void waiting(){
        if(status.equals("Waiting in sky")){
            throw new IllegalStateException("The plane is already in sky");}
        status = "Waiting in sky";
        System.out.println("Waiting for fly");
        }
    
    public void canceled(){
        if(status.equals("Waiting in sky")){
            throw new IllegalStateException("The plane is already in sky");}
        status = "Waiting in sky";
        System.out.println("Flight canceled");
    }    
    public static void main(String[] args){
        Plane s = new Plane();
        s.waiting();
        s.canceled();
        s.fly();
        
        
    }
}
