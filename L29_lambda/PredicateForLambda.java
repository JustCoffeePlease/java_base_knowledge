
package L29_lambda;

import java.util.ArrayList;
import java.util.function.*;

public class PredicateForLambda {
    
}
class Student{
    String name;
    char sex;
    int age;
    int course;
    double avg_grade;
    
    Student(String name, char sex, int age, int course, double avg_grade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avg_grade = avg_grade;
    }
}
class StudentInfo{
    
    void printStudent(Student st){
        System.out.println("Student name: " + st.name + " sex: " + st.sex +
                " age: " + st.age + " course " + st.course +
                " Averrage grade: " + st.avg_grade);
    }
    
    void testStudents(ArrayList <Student> aL, Predicate<Student> t){
        for(Student s: aL){
            if(t.test(s)){
                printStudent(s);
            }
        }
    } 
    
    public static void main(String[] args) {
        ArrayList <Student> list = new ArrayList<>();
        
        Student st1 = new Student("Alex", 'M', 22, 3, 8.3);
        Student st2 = new Student("Olesya", 'F', 25, 5, 9.3);
        Student st3 = new Student("Evgeni", 'M', 23, 4, 7.3);
        Student st4 = new Student("Vasya", 'M', 20, 1, 7.1);
        Student st5 = new Student("Maria", 'F', 19, 1, 8.4);
        
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        
        StudentInfo si = new StudentInfo();
        for(Student s: list){
            System.out.println(s.name);
        }
        System.out.println("-------------------------------------------------");
        list.removeIf(x -> x.name.endsWith("a"));
        for(Student s: list){
            System.out.println(s.name);}        
        }
    
        
//        si.testStudents(list, (Student st) -> {return st.avg_grade > 8.5;});
//        System.out.println("-------------------------------------------------");
//        si.testStudents(list, st -> st.avg_grade < 9.0);
//        System.out.println("-------------------------------------------------");
//        si.testStudents(list, (Student st) -> st.age > 19);
//        System.out.println("-------------------------------------------------");        
//        si.testStudents(list, (Student st) -> {return st.age < 23;});
//        System.out.println("-------------------------------------------------");
//        si.testStudents(list, (Student st) -> {return st.sex == 'M';});
//        System.out.println("-------------------------------------------------");
//        si.testStudents(list, (Student st) -> {return st.sex == 'F' && st.age > 20 && st.avg_grade < 9.0;});
//    }   
}
