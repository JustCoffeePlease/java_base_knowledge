//
//package L23_overriding_hiding_final;
//
//public class Test5 {
//
//    public Object abc() {
////        return new Doctor();
//        return new int[]{2, 7, 4, 0};
//    }
//
//    public static void main(String[] args) {
//        Employee emp = new Employee();
//        Teacher t = new Teacher();
////        emp.sleep(); // ����� ������� ������ ��� �� private
//        t.sleep();
//        Employee e = new Teacher();
////        e.sleep(); // ����� ������� ������ ��� �� private
//        
//        System.out.println(t.salary);
//    }
//}
//
//class Employee extends java.lang.Object {
//
//    double salary = 80000;
//    String name;    
//    int age;
//    int experience;
//
//    void eat() {
//        System.out.println("eat");
//    }
//
//    private void sleep() {
//        System.out.println("Employe is sleeping");
//    }
//
//}
//
//class Doctor extends Employee {
//
//    void treat() {
//        System.out.println("treat");
//    }
//}
//
//class Surgeon extends Doctor {
//}
//
//class Teacher extends Employee {
//    
//    double salary = 150_000;
//    int students_count;
//
//    void teach() {
//        System.out.println("teach");
//    }
////@Override - ���������� ��������, ��� ����� ��� �����������
//    public void sleep() {
//        System.out.println("Teacher is sleeping");
//    }
//    public static void main(String[] args){
//        Teacher t = new Teacher();
//        t.sleep();
//    }
//}
//
//
//
//
//class Driver extends Employee {
//
//    String car_name;
//
//    void drive() {
//        System.out.println("drive");
//    }    
//}
//
//// ���� ������� ����� final, �� � ���� �� ����� ��������
//// ������������ �� �����������, ������� � ��� ��� ������ ������ final
////final class T{}
////class P extends T{}