
package Lesson_10;

import Lesson_9.*;
import java.lang.*; // Импортируется автоматически

public class AA {
    
    public static void main(String[] args){
    
        String st1 = new String("Hello");
        Student st2 = new Student();
               
        System.out.println(st2.z);
        System.out.println(st2.c);
        System.out.println(Student.c);
        // Переменная статическая, поэтому используем имя класса

    }
    
}

class B{

    Student st3 = new Student();
}