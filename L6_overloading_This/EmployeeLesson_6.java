
package L6_overloading_This;

public class EmployeeLesson_6 {
    
    EmployeeLesson_6(int id2, String surname2, int age2){
        this(id2, surname2, age2, 0.0, null);
    }
    
    public EmployeeLesson_6(String surname3, int age3){
        this(0, surname3, age3, 0.0, null);
    }
    
    EmployeeLesson_6(int id4, String surname4, int age4, double salary4, String department4){
        id = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        department = department4;
    }
    
    
    int id;
    String surname;
    int age;
    double salary;
    String department;
}
    
   class EmployeeTest{
        public static void main(String[] args){
            EmployeeLesson_6 emp1 = new EmployeeLesson_6(1, "Vasilev", 25);
                System.out.println(emp1.surname);
            EmployeeLesson_6 emp2 = new EmployeeLesson_6("Kharlamova",30);
                System.out.println(emp2.surname);
            EmployeeLesson_6 emp3 = new EmployeeLesson_6(2, "Rozhin", 30, 100.35, "Engineering");
                System.out.println(emp3.department);
        }
}

