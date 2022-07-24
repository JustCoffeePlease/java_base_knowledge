
package L29_lambda;
import java.util.ArrayList;
public class Test2 {
    
}
//class Student{
//    String name;
//    char sex;
//    int age;
//    int course;
//    double avg_grade;
//    
//    Student(String name, char sex, int age, int course, double avg_grade){
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//        this.course = course;
//        this.avg_grade = avg_grade;
//    }
//}
//class StudentInfo{
//    
//    void printStudent(Student st){
//        System.out.println("Student name: " + st.name + " sex: " + st.sex +
//                " age: " + st.age + " course " + st.course +
//                " Averrage grade: " + st.avg_grade);
//    }
//    
//    void testStudents(ArrayList <Student> aL, StudentChecks sc){
//        for(Student s: aL){
//            if(sc.test(s)){
//                printStudent(s);
//            }
//        }
//    } 
//    
//    public static void main(String[] args) {
//        ArrayList <Student> list = new ArrayList<>();
//        
//        Student st1 = new Student("Alex", 'M', 22, 3, 8.3);
//        Student st2 = new Student("Olesya", 'F', 25, 5, 9.3);
//        Student st3 = new Student("Evgeni", 'M', 23, 4, 7.3);
//        Student st4 = new Student("Vasya", 'M', 20, 1, 7.1);
//        Student st5 = new Student("Maria", 'F', 19, 1, 8.4);
//        
//        list.add(st1);
//        list.add(st2);
//        list.add(st3);
//        list.add(st4);
//        list.add(st5);
//        
//        StudentInfo si = new StudentInfo();
//        
//        FindStudentsOverGrade fsog = new FindStudentsOverGrade();        
//        FindStudentsUnderGrade fsug = new FindStudentsUnderGrade();
//        FindStudentsOverAge fsoa = new FindStudentsOverAge();
//        FindStudentsUnderAge fsua = new FindStudentsUnderAge();
//        FindStudentsMixCondition fsmc = new FindStudentsMixCondition();
//        
//        si.testStudents(list, fsog);
//        System.out.println("-------------------------------------------------");
//        si.testStudents(list, fsug);
//        System.out.println("-------------------------------------------------");
//        si.testStudents(list, fsoa);
//        System.out.println("-------------------------------------------------");        
//        si.testStudents(list, fsua);
//        System.out.println("-------------------------------------------------");
//        si.testStudents(list, fsmc);
//    }   
//}
//
//interface StudentChecks{
//    boolean test(Student s);
//}
//
//class FindStudentsOverGrade implements StudentChecks{
//    public boolean test(Student s){
//        return s.avg_grade > 8.5;
//    }
//}
//
//class FindStudentsUnderGrade implements StudentChecks{
//    public boolean test(Student s){
//        return s.avg_grade < 8.5;
//    }
//}
//
//class FindStudentsOverAge implements StudentChecks{
//    public boolean test(Student s){
//        return s.age > 20;
//    }
//}
//
//class FindStudentsUnderAge implements StudentChecks{
//    public boolean test(Student s){
//        return s.age < 27;
//    }
//}
//
//class FindStudentsBySex implements StudentChecks{
//    public boolean test(Student s){
//        return s.sex == 'm';
//    }
//}
//
//class FindStudentsMixCondition implements StudentChecks{
//    public boolean test(Student s){
//        return (s.avg_grade > 7.2 && s.age < 23 && s.sex == 'f');
//    }
//}