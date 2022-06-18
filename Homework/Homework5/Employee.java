
package Homework.Homework5;

public class Employee {
    
    Employee(int emp_id, String emp_surname, int emp_age, double emp_salary, String emp_department){
        
        id = emp_id;
        surname = emp_surname;
        age = emp_age;
        salary = emp_salary;
        department = emp_department;
    }
    
    int id;
    String surname;
    int age;
    double salary;
    String department;
    
    double DoubleSalary(){
        return salary * 2; 
    }
}

class Employeetest{
    public static void main(String[] args){
        
        Employee emp1 = new Employee(1, "Vasilev", 25, 250_000, "IT Development");
        Employee emp2 = new Employee(2, "Kharlamova", 36, 500_000, "IT Analytics");
    
        double DoubleSalary1 = emp1.DoubleSalary();
        double DoubleSalary2 = emp2.DoubleSalary();
        
        System.out.println("Salary of " + emp1.surname +" is "+ emp1.salary);
        System.out.println("Salary of " + emp2.surname +" is "+ emp2.salary);
        
        System.out.println("New salary of " + emp1.surname +" is "+ DoubleSalary1);
        System.out.println("New salary of " + emp2.surname +" is "+ DoubleSalary2);

    }    
}