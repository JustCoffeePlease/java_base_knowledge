
package L20_ArrayList_Iterartor_1;
// В ArrayList всегда должны находиться сложные типы данных
import  java.util.ArrayList;

public class Test2 {
    public static void main(String[] args){
        ArrayList <String> list = new ArrayList<>();
        
        list.add("Hey");                // index 0
        list.add("Hello");              // index 1
        list.add("Good morning");       // index 2
        list.add("Good Afternoon");     // index 3
        
        list.add(1, "Wow"); // добавление нового значения на указанную позицию
        
        for(String s: list){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(list.get(3)); // get index 3 element
        
        // Вывод элементов ArrayList с помощью метода get
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        
        // Замена элемента по индексу
        list.set(1, "!!!");
        
        for(String s: list){
            System.out.print(s + " ");
        }
    }
}
