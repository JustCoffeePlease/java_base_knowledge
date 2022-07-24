
package L20_ArrayList_Iterartor_1;
// В основе ArrayList находится массив типа данных object
// В отличие от обычного массива, этот может увеличивать и уменьшать свой размер
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
        
        // ограничения для ArrayList по типу данных
        ArrayList <String> list2 = new ArrayList<String>();
        // более короткая запись
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