
package Homework.Homework12;

import Lesson_11.Student;

public class StudentTestFromZaur {
    
    public static void method1(Student st1, Student st2){
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade){
            System.out.println("Students are the same");}
        else {
            System.out.println("Students are different");}
    }
    
    public static void method2(Student st1, Student st2){
        if (st1.name.equals(st2.name)){
            if (st1.course == st2.course){
                if (st1.grade == st2.grade){
                    System.out.println("Student are the same");}
                else {
                    System.out.println("Students name and course are same but grades are different");}} 
            else{
                System.out.println("Students name are same but course and grades are different");}}
        else{
            System.out.println("All students parameters are different");}
    }
    
    public static void main(String[] args){
        Student s1 = new Student("Alex", 3, 9.5);
        Student s2 = new Student("Alex", 3, 9.5);
        Student s3 = new Student("Alex", 3, 10.0);
        Student s4 = new Student("Alex", 5, 10.0);
        Student s5 = new Student("Olesya", 5, 10.0);
        
        method1(s1, s2);
        method1(s1, s3);
        
        method2(s1, s2);
        method2(s1, s3);
        method2(s1, s4);
        method2(s1, s5);

        
    }
}
