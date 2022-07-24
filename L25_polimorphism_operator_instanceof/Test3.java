
package L25_polimorphism_operator_instanceof;

public class Test3 {
    public static void main(String[] args){
        
        Help_able h = new Doctor();
        
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
        Employee emp4 = new Employee();
        Employee [] array = {emp1, emp2, emp3};
        
        
        Employee e = new Employee();
        
        Test3  t = new Test3();
        
        System.out.println(e == emp2);
//        System.out.println(e == t);
        System.out.println(e.equals(t));
        
        
//        Driver d = (Driver)emp1;

        ((Doctor)emp3).help();
        
//        Doctor d1 = (Doctor)emp3;
//        System.out.println(d1.profession);
//        d1.treat();
        System.out.println(((Doctor)emp3).profession);
        ((Doctor)emp3).treat();
        
        h.help();
        System.out.println(((Doctor)h).profession);
        ((Doctor)h).treat();
        
        for(Employee e1: array){
            if(e1 instanceof Driver){
                System.out.println(((Driver)e1).car_name);
                ((Driver)e1).drive();
            }
        }
    }
}


class Employee {
    double salary = 80000;
    String name;
    int age;
    int experience;
    void eat() {
        System.out.println("eat");
    }   
    void sleep() {
        System.out.println("sleep");
    }

}

class Doctor extends Employee implements Help_able{
    String profession = "Surgeon";
    public void help(){System.out.println("Doctor is helping");}
    void treat() {
        System.out.println("treat");
    }
}

class Teacher extends Employee{
    int count_student;
    void teach() {
        System.out.println("teach");
    }
}

class Driver extends Employee{
    String car_name = "mercedes g350";
    void drive() {
        System.out.println("drive");
    }
}    

interface Help_able{
    void help();
}