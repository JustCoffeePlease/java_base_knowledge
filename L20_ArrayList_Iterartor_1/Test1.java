
package L20_ArrayList_Iterartor_1;
// � ������ ArrayList ��������� ������ ���� ������ object
// � ������� �� �������� �������, ���� ����� ����������� � ��������� ���� ������
import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args){
        ArrayList list = new ArrayList();
        
        list.add("Hello");
        Car c = new Car();
        list.add(c);
        Student s = new Student();
        list.add(s);
        list.add(new StringBuilder("All Right"));
        
        // ����������� ��� ArrayList �� ���� ������
        ArrayList <String> list2 = new ArrayList<String>();
        // ����� �������� ������
//        ArrayList <String> list2 = new ArrayList();
        list2.add("Hi");
//        list2.add(s);
        List <StringBuilder> list3 = new ArrayList();
        list3.add(new StringBuilder("Hi"));
        
        ArrayList <String> list5 = new ArrayList<>(list2);
            System.out.println(list2 == list5);
    }
}

class Car{}
class Student{}