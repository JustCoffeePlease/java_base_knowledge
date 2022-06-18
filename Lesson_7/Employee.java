
package Lesson_7;

public class Employee {
    public double salary;
    
    public void TwoSalary(){
        double result = salary * 2;
        System.out.println("Your new salary is " + result);
    }
    
    public Employee(double salary2){
        salary = salary2;
    }
    
    public static void main(String[] args){
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.TwoSalary();
    }
}

class EmployeeTest{
    public static void main(String[] args){
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.TwoSalary();
    }
            
}
