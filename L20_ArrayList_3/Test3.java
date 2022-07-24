package L20_ArrayList_3;

import java.util.ArrayList;

public class Test3 {

    public static void main(String[] args) {
        ArrayList al1 = new ArrayList<>();
        al1.add(new Test3());
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        for (Object o : al1) {
            System.out.println("Number = " + o + " and length = " + ((String) o).length());
        }
    }
}
