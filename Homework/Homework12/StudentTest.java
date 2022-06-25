
package Homework.Homework12;

import L11_primitive_and_reference_data_types_when_calling_a_method.Student;

public class StudentTest {
    
    public static void comparison_if_statement(Student s1, Student s2){
    
        if (s1.equals(s2)){
//        if (s1 == s2){
            System.out.println("Students are the same");
        }
        else {
            System.out.println("Student are different");
        }
    }
    
    public static void comparison_nested_if_statement(Student s1, Student s2){
    
        if (s1.name.equals(s2.name)){
            if (s1.grade == s2.grade){
                if (s1.course == s2.course){}
                else{
                    System.out.println("Student are different because of defferent course");}
            }
            else{
                System.out.println("Student are different because of defferent grade");}
        }
        else{
            System.out.println("Student are different because of defferent name");}
    }
    
    public static void main(String[] args){
    
        Student st1 = new Student("Alex", 3, 9.5);
        Student st2 = new Student("Olesya", 5, 10.0);
        Student st3 = new Student("Olesya", 5, 10.0);
        Student st4 = st1;
        
//        comparison_if_statement(st2, st3);
        comparison_nested_if_statement(st3, st2);
    }
}
