
package L16_about_string_1;

public class Test4 {
    
}

class Employee{
    double salary;
    boolean isManager;
    
    Employee(double salary, boolean isManager){
        this.salary = salary;
        this.isManager = isManager;
    }
}

class TestEmployee{
    public static void main(String[] args){
        Employee emp = new Employee(100000, true);
            System.out.println("On manager? " + emp.isManager + " His salary is " + emp.salary);
    }
}
