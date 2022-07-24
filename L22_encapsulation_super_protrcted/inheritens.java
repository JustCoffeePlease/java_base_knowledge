package L22_encapsulation_super_protrcted;

public class inheritens {
    
    void increaseSalary(Employee e){
        e.salary = e.salary + 50000;
    }
    
    public static void main(String[] args){
        Doctor doc = new Doctor();
        doc.name = "Yulia";
        doc.age = 42;
        doc.experience = 17;
        doc.profession = "Gynecologist";
        doc.eat();
        doc.sleep();
        doc.treat();
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

class Doctor extends Employee{
    String profession;
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
    int car_name;
    void drive() {
        System.out.println("drive");
    }
}
