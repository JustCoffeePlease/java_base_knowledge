
package L7_1_package_access_modifiers;

public class ThirdClass {
        public static void main(String[] args){
        L7_package_access_modifiers.Employee emp = new L7_package_access_modifiers.Employee(500);
        System.out.println(emp.salary);
        emp.TwoSalary();
        }
}
