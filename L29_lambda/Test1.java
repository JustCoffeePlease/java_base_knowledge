
package L29_lambda;

import java.util.ArrayList;

public class Test1 {
    
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
    void printStudentOverGrade(ArrayList <Student> aL, double avg_grade){
        for(Student s: aL){
            if (s.avg_grade > avg_grade){
                printStudent(s);
            }
        }
    }
    void printStudentUnderGrade(ArrayList <Student> aL, double avg_grade){
        for(Student s: aL){
            if (s.avg_grade < avg_grade){
                printStudent(s);
            }
        }
    }
    void printStudentOverAge(ArrayList <Student> aL, int age){
        for(Student s: aL){
            if (s.age > age){
                printStudent(s);
            }
        }
    }
    void printStudentUnderAge(ArrayList <Student> aL, int age){
        for(Student s: aL){
            if (s.age < age){
                printStudent(s);
            }
        }
    }
    void printStudentBySex(ArrayList <Student> aL, char sex){
        for(Student s: aL){
            if (s.sex == sex){
                printStudent(s);
            }
        }
    }
    void printStudentMixConditions(ArrayList <Student> aL, double avg_grade, int age, char sex){
        for(Student s: aL){
            if (s.avg_grade > avg_grade && s.sex == sex && s.age < age){
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
        si.printStudentOverGrade(list, 8.3);
        System.out.println("-------------------------------------------------");
        si.printStudentUnderGrade(list, 8.3);
        System.out.println("-------------------------------------------------");
        si.printStudentOverAge(list, 20);
        System.out.println("-------------------------------------------------");
        si.printStudentUnderAge(list, 24);
        System.out.println("-------------------------------------------------");
        si.printStudentBySex(list, 'F');
        System.out.println("-------------------------------------------------");
        si.printStudentMixConditions(list, 7.2, 23, 'F');
        
    }
    
}