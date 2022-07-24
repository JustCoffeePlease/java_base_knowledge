
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
        // ����� �������� �� ������� (������� ������ ������ ������� ��������)
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println(list.indexOf(new String("How are you?")));
        // ����� �������� �� ������� (������� ������ ������ ���������� ��������)
        System.out.println(list.lastIndexOf(new String("How are you?")));
        // ����� ������� �����
        System.out.println(list.size());
        // ��������, ������ �� ArrayList
        System.out.println(list.isEmpty());
        // �������� ������� ������� � �����
        System.out.println(list.contains("I am Alex"));
        // ����������� String ������������� �� �����
        System.out.println(list.toString());
    }
}
