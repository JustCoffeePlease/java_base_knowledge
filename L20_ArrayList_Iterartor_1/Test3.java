
package L20_ArrayList_Iterartor_1;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args){
        ArrayList <StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("Hello!");
        StringBuilder sb2 = new StringBuilder("How are you?");
        StringBuilder sb3 = new StringBuilder("I am Alex");
        
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        // ��������� � ������� �������� ArrayList ��������������� ����
        for(int i = 0; i < list.size(); i++){
            list.get(i).append("!");
        }
        
        for(StringBuilder sb: list){
            System.out.print(sb + " ");
        }
        System.out.println();
        // �������� ��������� �� ArrayList
        list.remove(2);
        list.remove(sb1);
        list.remove("How are you?");
//        list.remove(new StringBuilder("How are you?"));
        for (StringBuilder sb: list){
            System.out.print(sb + " ");
        }
        
        ArrayList <StringBuilder> list2 = new ArrayList<>();
        list2.add(new StringBuilder("Petrov"));
        list2.add(new StringBuilder("Sidorov"));
        list2.add(new StringBuilder("Vasilev"));
        // ���������� � ArrayList ���� ��������� �� ������� ArrayList
        list.addAll(list2);
        // ���������� � ArrayList ���� ��������� �� ������� ArrayList
        // � ����������� �������
//        list.addAll(1, list2);
        
        for (StringBuilder sb: list){
            System.out.print(sb + " ");
        }
        // ������ ������� �����
        System.out.println();
        System.out.println("-------------------------------------------");
        list.clear();
        for (StringBuilder sb: list){
            System.out.print(sb + " ");
        }        
    }  
}
