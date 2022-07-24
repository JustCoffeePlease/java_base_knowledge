
package L22_encapsulation_super_protrcted;

public class Human {
//    public Human(String n){
//        name = n;
//    }

// private elements не наследуются    
    public String name = "Vasya";
    public static int salary = 200_000;
    public void work(){System.out.println("Work");}
    public static void rest(){System.out.println("Sleep");}
}

class Student extends Human{
    public static void main(String[] args){
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(Student.salary);
        s.work();
        Student.rest();
    }
}