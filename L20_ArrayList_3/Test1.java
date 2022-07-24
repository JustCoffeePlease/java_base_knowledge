
package L20_ArrayList_3;

import java.util.ArrayList;
import java.util.List;
        
public class Test1 {
    public static void main(String[] args){
        ArrayList <String> al1 = new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        
        System.out.println("all = " + al1);
        
        ArrayList <String> al2 = new ArrayList<>();
        al2.add("one");
        al2.add("three");
        al2.add("four");
        al2.add("ten");
        
        // removeAll
        // ������� �� ������ ������� �������� ������� �������
//        al1.removeAll(al2);
//        System.out.println("all = " + al1);
        
        // retainAll
        // ���������� ������ ����� �������� ��������
//        al1.retainAll(al2);
//        System.out.println("all = " + al1);     

        // containsAll
        // ���������� True, ���� ���� ������ �������� ��� �������� ������� �������
        // ���������� False, ���� ���� ������ �������� �� ��� �������� ������� �������
        boolean result = al1.containsAll(al2);
        System.out.println("result = " + result);
        
        //sublist
        // ������� �� ���������� ����� sublist, �� ���� ��� "�������"
        // � ���������� list
        System.out.println("-------------------------------------------------");
        
        List <String> sublist= al1.subList(1, 4);
        System.out.println("Sublist: " + sublist);
        
        sublist.add("ten");
        System.out.println("Sublist: " + sublist);
        al1.add("million");
        System.out.println("all = " + al1);
        
        // toArray
        // ���������� ������ ���� Object
        Object [] array = al1.toArray();
        String [] array_2 = al1.toArray(new String [10]);
        
        for(String s: array_2){
            System.out.println(s);
        }
    }
}
