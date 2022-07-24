
package L20_ArrayList_Iterartor_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Iterator;

public class Test7 {
    public static void main(String[] args){
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        
        ArrayList <String> list1 = new ArrayList<>();
        
        list1.add(s3);
        list1.add(s1);
        list1.add(s4);
        list1.add(s2);
            System.out.println(list1);
            // Сортировка
            Collections.sort(list1);
            System.out.println(list1);
            
        // Сравнение
        ArrayList <String> list2 = list1;
            System.out.println(list1.equals(list2));
            
        ArrayList <String> list3 = new ArrayList<>();
        
        list3.add(s3);
        list3.add(s1);
        list3.add(s4);
        list3.add(s2);
        
        System.out.println(list1.equals(list3));
        System.out.println("--------------------------------------------------");
        
        // Два ArrayList считаются равными, если они содержат одинаковые элементы
        // Порядок значений важен
        
        // ----------------------------------------------------------------------
        // ITERATOR
        // Разница с ForEach в том, что в Iterarot можно удалять элемент ArrayList
        // С помощью ForEach это сделать невозможно
        Iterator <String> it = list1.iterator();
        while(it.hasNext()){ // проверка наличия следующего элемента
            System.out.println(it.next());
        }
        ListIterator <String> it1 = list1.listIterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
        
        // Удаление элемента
        while (it.hasNext()){
            it.next(); // Если после проверки есть следующий элемент, то next нам его выдает
            it.remove(); // remove его удаляет
        }
    }   
}
