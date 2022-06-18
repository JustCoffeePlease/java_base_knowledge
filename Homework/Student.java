
package Homework;

public class Student {
// В этом классе определяются переменные
    int stud_num;
    String first_name, last_name, stud_year;
    // Оценки по пятибальной шкале
    double av_math, av_econ, fo_lang;
}

class StudentTest{

    public static void main(String[] args){
    // Создаем объекты класса Student
    double av1, av2, av3; 

        Student student1 = new Student();
                student1.stud_num = 1;
                student1.first_name = "Olesya";
                student1.last_name = "Kharlamova";
                student1.stud_year = "2003";
                student1.av_math = 4.8;
                student1.av_econ = 4.9;
                student1.fo_lang = 4.5;

        Student student2 = new Student();
                student2.stud_num = 2;
                student2.first_name = "Alex";
                student2.last_name = "Vasilev";
                student2.stud_year = "2014";
                student2.av_math = 4.1;
                student2.av_econ = 4.2;
                student2.fo_lang = 4.6;

        Student student3 = new Student();
                student3.stud_num = 3;
                student3.first_name = "Alla";
                student3.last_name = "Pugacheva";
                student3.stud_year = "1932";
                student3.av_math = 4.4;
                student3.av_econ = 3.8;
                student3.fo_lang = 4.9;
        
        av1 = (student1.av_math + student1.av_econ + student1.fo_lang)/3;
        av2 = (student2.av_math + student2.av_econ + student2.fo_lang)/3; 
        av3 = (student3.av_math + student3.av_econ + student3.fo_lang)/3; 
                
        System.out.println("Average grade of " + student1.first_name + " is " +
                            av1);
        System.out.println("Average grade of " + student2.first_name + " is " +
                            av2);
        System.out.println("Average grade of " + student3.first_name + " is " +
                            av3);
    }
}

