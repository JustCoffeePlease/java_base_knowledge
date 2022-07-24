package L23_overriding_hiding_final;

public class Test2 {

    public Object abc() {
//        return new Doctor();
        return new int[]{2, 7, 4, 0};
    }

    public static void main(String[] args) {
//        Doctor d = new Doctor();
//        Teacher t = new Teacher();
//        Driver dr = new Driver();
//        Employee e = new Employee();

        Employee emp1 = new Doctor();
        System.out.println(emp1.salary);
        System.out.println(emp1.name);
        System.out.println(emp1.age);
        System.out.println(emp1.experience);
        emp1.eat();
        emp1.sleep();
//        emp1.treat(); // Ошибка, так как у Employee нет такого класса
        
        
        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();

        Doctor d2 = new Surgeon();
        System.out.println(d2.age);
        System.out.println(d2.name);
        System.out.println(d2.experience);
        d2.sleep();
        d2.eat();
        
        
        Employee emp4 = new Surgeon();
    }
}

class Employee extends java.lang.Object {

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

class Doctor extends Employee {

    void treat() {
        System.out.println("treat");
    }
}

class Surgeon extends Doctor {
}

class Teacher extends Employee {

    int students_count;

    void teach() {
        System.out.println("teach");
    }
}

class Driver extends Employee {

    String car_name;

    void drive() {
        System.out.println("drive");
    }
}
