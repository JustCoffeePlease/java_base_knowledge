
package L22_test;

import L22_encapsulation_super_protrcted.*;

public class Student extends Human{
    public static void main(String[] args){
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(Student.salary);
        s.work();
        Student.rest();
    }
}
