
package L20_ArrayList_Iterartor_1;

import java.util.*;
import java.util.Arrays;

public class Test6 {
    public static void main(String[] args){
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        
        ArrayList <StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);
        
        // Метод клонирования объектов ArrayList в другой ArrayList
//        ArrayList <StringBuilder> list2 = (ArrayList<StringBuilder>)list1.clone();
//        ArrayList <StringBuilder> list3 = list1;
//        
//        System.out.println(list1 == list2);                 // false
//        System.out.println(list1 == list3);                 // true
//        
//        System.out.println(list1.get(0) == list2.get(0));   //true
//        
//        System.out.println("-------------------------------------------------");
//        
//        list1.get(0).append("!!!");
//        System.out.println(list2.get(0));
//        
//        list1.set(0, new StringBuilder("D"));
//        System.out.println(list2.get(0));

        Object [] array_1 = list1.toArray();
        for(Object o: array_1){
            System.out.print(o + " ");
        }
        System.out.println();
        // Создание массива, в котором будут значения из ArrayList
        StringBuilder [] array_2 = list1.toArray(new StringBuilder[10]);
        
        for(StringBuilder o: array_2){
            System.out.print(o + " ");
        }
        
        System.out.println();
        StringBuilder [] array = {sb2, sb3, sb3, sb3};
        // List всегда той же длины, что и array
        // List полностью связан с массивом, в
        // отличие от методов clone и toArray
        List <StringBuilder> list8 = Arrays.asList(array);
        System.out.println(list8);
        
        array[0].append("!!!");
        array[1] = new StringBuilder("E");
        
        System.out.println(list8);
    }
}
