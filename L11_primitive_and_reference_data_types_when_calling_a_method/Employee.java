
package L11_primitive_and_reference_data_types_when_calling_a_method;

public class Employee {
    //Переменные
    public String name;
    public double salary;
    //Конструктор
    Employee(String name, double salary){
    
        this.name = name;
        this.salary = salary;
    }
    //Функции
    public double increase(double a){
        
        a = a * 2;
        
        return a;
    }
    
    public double increaseYourSalary(){
    
        salary = salary * 2;
        
        return salary;
    }
}

class EmployeeTest{

    public static void main(String[] args){
    
        Employee emp1 = new Employee("Alex", 100000.55);
        
        double d = emp1.increase(emp1.salary);
        
        System.out.println("Your salary by the end of current year will be: " + d);
        System.out.println("Your current salary: " + emp1.salary);
        
        emp1.increaseYourSalary();
        
        System.out.println(emp1.salary);

    }
}