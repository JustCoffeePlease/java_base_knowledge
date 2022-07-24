
package L20_ArrayList_Iterartor_1;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args){
        ArrayList <String> list = new ArrayList<>();
        String s1 = new String("Hello!");
        String s2 = new String("How are you?");
        String s3 = new String("I am Alex");
        
        list.add(s1);
        list.add(s2);
        list.add(s3);
        
        for(String s: list){
            System.out.print(s + " ");
        }
        // Поиск элемента по индексу (Находит индекс самого первого элемента)
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println(list.indexOf(new String("How are you?")));
        // Поиск элемента по индексу (Находит индекс самого последнего элемента)
        System.out.println(list.lastIndexOf(new String("How are you?")));
        // Вывод размера листа
        System.out.println(list.size());
        // Проверка, пустой ли ArrayList
        System.out.println(list.isEmpty());
        // Проверка наличия объекта в листе
        System.out.println(list.contains("I am Alex"));
        // Возвращение String репрезентации на экран
        System.out.println(list.toString());
    }
}
