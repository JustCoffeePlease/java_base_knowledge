package L29_lambda_var;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test2 {

    public static void main(String[] args) {
        List<String> list = List.of("Hello", "Bue", "How are you?", "It is OK");
//        for(String s: list){
//            System.out.println(s);
//        }
        // Аналогичная запись
        list.forEach(s -> System.out.println(s));

        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(2);
        a1.add(6);
        a1.add(4);
        a1.add(5);
        a1.add(3);
        a1.add(7);
        a1.add(1);

//        a1.removeIf(element -> element % 3 ==0);
//        System.out.println(a1);
        // Аналогичная запись
//        Predicate<Integer> p = element -> element % 3 == 0;
//        a1.removeIf(p);
        System.out.println(a1);

// Сортировка от меньшего к большему
        a1.sort((x, y) -> x.compareTo(y));
        System.out.println(a1);
// Сортировка от большего к меньшему        
        a1.sort((x, y) -> -x.compareTo(y));
        System.out.println(a1);

        System.out.println("-------------------------------------------------");

        final String str = "qwerty";
        
        for (String s : list) {
            Predicate<String> p = z -> {
                System.out.println(str.length());
                return z.length() > 4;
            };
        }
    }
}
