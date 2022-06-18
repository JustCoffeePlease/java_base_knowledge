
package Homework.Homework7;

public class Employee {
    // Переменные  
    int id;
    public String surname; 
    private double salary; 
    
    // Конструкторы
    public Employee(int id2){
        id = id2;
    }
    
    Employee(String surname2){
        surname = surname2;
    }
    
    private Employee(double salary2){
        salary = salary2; 
    }
    
    // Методы
    public void ShowEmployeeID(){
        System.out.println("The employee id: " + id);
    }
    
    public void ShowEmploeeSurname(){
        System.out.println("The employee Surname is: " + surname);
    }
    
    public void ShowEmployeeSalary(){
        System.out.println("The employee salary is: " + salary);
    }
    
    public static void main(String[] args){
        Employee emp1 = new Employee("Vasilev");
        Employee emp2 = new Employee(1);
        Employee emp3 = new Employee(555.5);
        
        System.out.println("Surname is " + emp1.surname);
        System.out.println("Id is " + emp2.id);
        System.out.println("Salary is " + emp3.salary);

        emp1.ShowEmploeeSurname();
        emp2.ShowEmployeeID();
        emp3.ShowEmployeeSalary();

    }
}

//class EmployeeTest{
//    public static void main(String[] args){
//        Employee emp1 = new Employee("Vasilev");
//        Employee emp2 = new Employee(1);
//        Employee emp3 = new Employee(555.5);
//        
//        System.out.println("Surname is " + emp1.surname);
//        System.out.println("Id is " + emp2.id);
//        System.out.println("Salary is " + emp3.salary);
//
//        emp1.ShowEmploeeSurname();
//        emp2.ShowEmployeeID();
//        emp3.ShowEmployeeSalary();
//    }
//}
