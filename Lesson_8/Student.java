
package Lesson_8;


public class Student {
    
    //Переменные
    String name;
    int course;
    static int count = 0; // static -> переменная является переменной всего класса
//    static final int count = 0;

    
    //Конструктор
    public Student(String name2, int course2){
        count++;
        name = name2;
        course = course2;
        System.out.println("Student # "+ count + " is created");
    }
    
    public static void showCount(){
        System.out.println("All students created " + count);
    }
}

class StudentTest{
    public static void main(String[] args){
        Student st1 = new Student("Alex", 1);
        Student st2 = new Student("Olesya", 2);
        Student st3 = new Student("Zaur", 6);
        Student st4 = new Student("Masha", 4);
        
        System.out.println(st1.name);
        System.out.println(Student.count);
        Student.showCount();
    }
}