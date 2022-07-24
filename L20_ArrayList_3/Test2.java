
package L20_ArrayList_3;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args){
        ArrayList <String> al1 = new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        
        System.out.println("ArrayList = " + al1);
        
        // List.of() - более короткая альтернатива методу add
        List <String> list = List.of("Один", "Два", "Три");
        System.out.println("list = " + list);
        // List.copyOf
        List <String> list2 = List.copyOf(al1);
        System.out.println("list2 = " + list2);
    }
}
//