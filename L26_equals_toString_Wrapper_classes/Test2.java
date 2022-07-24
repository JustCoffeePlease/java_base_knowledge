
package L26_equals_toString_Wrapper_classes;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args){
        ArrayList <Integer> list = new ArrayList<>();
        list.add(5);
        
        Long l = 50L;
        
        int a = list.get(0);
        System.out.println(a);
        
        Integer b = new Integer(10);
        int c = b;
        
        
        switch(b){}
        
        String s1 = "50";
        String s2 = "true";
        String s3 = "3.14";
        
        int i1 = Integer.parseInt(s1);
        boolean b1 = Boolean.parseBoolean(s2);
        System.out.println(i1);
        System.out.println(b1);

        Integer i3 = Integer.valueOf(10);
        Double d2 = Double.valueOf(s3);
        Byte b10 = new Byte((byte)5);
        Integer i6 = new Integer(6);
        
        System.out.println(i3);
        System.out.println(d2);
        System.out.println(b10);
        System.out.println(i6);
        
    }
}
