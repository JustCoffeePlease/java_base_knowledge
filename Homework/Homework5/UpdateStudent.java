
package Homework.Homework5;

public class UpdateStudent {
    UpdateStudent(int snum, String fname, String lname, String syear, double amath, double aecon, double flang){
        stud_num = snum;
        first_name = fname;
        last_name = lname;
        stud_year = syear;
        av_math = amath;
        av_econ = aecon;
        fo_lang = flang;
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

        UpdateStudent student1 = new UpdateStudent(1, "Olesya", "Kharlamova", "2003", 4.8, 4.9, 4.5);
        UpdateStudent student2 = new UpdateStudent(2, "Alex", "Vasilev", "2014", 4.1, 4.2, 4.6);
        UpdateStudent student3 = new UpdateStudent(3, "Alla", "Pugacheva", "1932", 4.4, 3.8, 4.9);
        
        student1.AveragePoint();
        student2.AveragePoint();
        student3.AveragePoint();


    }
}


