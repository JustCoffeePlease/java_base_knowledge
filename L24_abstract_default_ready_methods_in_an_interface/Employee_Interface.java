//package L24_abstract_default_ready_methods_in_an_interface;
//
//public class Employee_Interface {
//    double salary = 80000;
//    String name;
//    int age;
//    int experience;
//    void eat() {
//        System.out.println("eat");
//    }
//    void sleep() {
//        System.out.println("sleep");
//    }
//    public static void main(String [] args){
//        Help_able h = new Driver();
//        Swim_able s = new Driver();
//        
//        System.out.println(h.a);
//        h.first_help();
//        s.swim();
//    }
//}
//class Doctor extends Employee_Interface {
//    void treat() {
//        System.out.println("treat");
//    }
//}
//class Surgeon extends Doctor {
//}
////abstract class Teacher extends Employee_Interface implements Help_able{
//abstract class Teacher extends Employee_Interface implements Help_able{
//    int students_count;
//    void teach() {
//        System.out.println("teach");
//    }
//    public void first_help(){System.out.println("Teacher is helping");}
//    public void extinguish_the_fire(){System.out.println("Teacher is extinguishing the fire");}
//}
//class Driver extends Employee_Interface implements Help_able, Swim_able{
//    String car_name;
//    void drive() {
//        System.out.println("drive");
//        }
//    int a = 8;
//    public void first_help(){System.out.println("Driver is helping");}
//    public void extinguish_the_fire(String s){System.out.println("Driver is extinguishing the fire" + s);}
//    public void swim(){System.out.println("Driver is swimming");}
//
//}
//
//interface Help_able{
//    // all methods are abstract and public 
//    void first_help();
//    void extinguish_the_fire(String obj);
//    int a = 10; // same as final public static
//    
//}
//
//interface Swim_able{
//    void swim();
//}
//
//abstract class Y implements Swim_able{}
//abstract class X extends Y{}
//
//class Z extends Y{
//public void swim(){};
//}