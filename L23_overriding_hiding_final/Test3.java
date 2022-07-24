//
//package L23_overriding_hiding_final;
//
//public class Test3 {
//    public static void main(String[] args){
////        Employee e = new Employee();
////        Teacher t = new Teacher();
////        e.eat();
////        t.eat();
//        Employee e = new Teacher();
//        e.eat();
//    }
//}
//
//class Food{}
//class Fruits extends Food{}
//
//class Employee extends java.lang.Object {
//
//    double salary = 80000;
//    String name;
//    int age;
//    int experience;
//
//    public Food eat() {
//        System.out.println("Employe is eating");
//        Food fd1 = new Food();
//        return fd1;
//    }
//
//    void sleep() {
//        System.out.println("sleep");
//    }
//
//}
//
//class Teacher extends Employee {
//
//    int students_count;
//    //overriding method
//    public Fruits eat() {
//        System.out.println("Teacher is eating");
//        Fruits fd2 = new Fruits();
//        return fd2;        
//    }
//    void teach() {
//        System.out.println("teach");
//    }
//}
//
//class A{
//    Employee objectCreation(){
//        return new Employee();
//    }
//}
//
//class B extends A{  
//    Teacher objectCreation(){
//        System.out.println("Ok");
//    return new H();
//    }
//}
//
//class H extends Teacher{}
//
