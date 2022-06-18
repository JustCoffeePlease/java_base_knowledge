
package Homework.Homework6;

public class StudentHW6 {
    StudentHW6(int snum, String fname, String lname, String syear, double amath, double aecon, double flang){
        stud_num = snum;
        first_name = fname;
        last_name = lname;
        stud_year = syear;
        av_math = amath;
        av_econ = aecon;
        fo_lang = flang;
        }
    
    StudentHW6(int snum1, String fname1, String lname1){
        this(snum1, fname1, lname1, null, 0.0, 0.0, 0.0);
    }
    
    StudentHW6(){
        this(0, null, null, null, 0.0, 0.0, 0.0);
    }
    
    int stud_num;
    String first_name, last_name, stud_year;
    double av_math, av_econ, fo_lang;
    
    double AveragePoint(){
        System.out.println((av_math + av_econ + fo_lang)/3);
        return (av_math + av_econ + fo_lang)/3;
    }
}

class StudentTest{

    public static void main(String[] args){
    // Создаем объекты класса Student 

        StudentHW6 student1 = new StudentHW6(1, "Olesya", "Kharlamova", "2003", 4.8, 4.9, 4.5);
        StudentHW6 student2 = new StudentHW6(2, "Alex", "Vasilev");
            student2.stud_year = "2014";
            student2.av_math = 4.5;
            student2.av_econ = 4.6;
            student2.fo_lang = 4.8;
            
        StudentHW6 student3 = new StudentHW6();
        
        System.out.println(student1.first_name);
        System.out.println(student2.first_name);
        System.out.println(student3.first_name);
        
        student1.AveragePoint();
        student2.AveragePoint();
        student3.AveragePoint();


    }
}


