//
//package L25_polimorphism_operator_instanceof;
//
//public class Test1 {
//    public static void main(String[] args){
//        
//        Employee emp1 = new Teacher();
//        Employee emp2 = new Driver();
//        Employee emp3 = new Doctor();
//        Help_able h = new Teacher();
////        emp1.help();
////        Driver [] array_1 = {new Driver(), new Driver()};
//        Employee [] array_2 = {emp1, emp2, emp3};
////        Help_able [] array_3 = {new Driver(), new Driver(), new Teacher(), new Doctor()};
//                
//        emp1.work();
//        emp2.work();
//        emp3.work();
//        
////        for(Employee emp:array_2){
////            emp.work();
////        }
//        System.out.println(emp1 instanceof Teacher);
//        System.out.println(emp1 instanceof Driver);
//        System.out.println(emp1 instanceof Help_able);
//        
//    }
//}
//
//abstract class Employee{
//    void sleep(){System.out.println("Employe sleeps");}
//    abstract void work();
//}
//class Teacher extends Employee implements Help_able{
//    public void help(){System.out.println("Teacher helps");};
//    void work(){System.out.println("Teacher works");}
//}
//class Driver extends Employee{
//    void work(){System.out.println("Driver works");}
//}
//class Doctor extends Employee{
//    void work(){System.out.println("Doctor works");}
//}
//interface Help_able{
//    void help();
//}