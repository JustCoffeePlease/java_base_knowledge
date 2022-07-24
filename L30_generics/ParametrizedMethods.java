
package L30_generics;

import java.util.ArrayList;

public class ParametrizedMethods {
    public static void main(String[] args) {
        ArrayList <Integer> aL1 = new ArrayList<>();
        aL1.add(10);
        aL1.add(20);
        aL1.add(30);
        aL1.add(40);
        aL1.add(50);
        
        int a = GenMethod.getSecondElement(aL1);
        System.out.println(a);
        
        ArrayList <String> aL2 = new ArrayList<>();
        aL2.add("a");
        aL2.add("b");
        aL2.add("c");
        aL2.add("d");
        aL2.add("e");

        String s = GenMethod.getSecondElement(aL2);
        System.out.println(s);        
    }
}

class GenMethod{
    public static <T> T getSecondElement(ArrayList<T> aL){
        return aL.get(1);
    }
}