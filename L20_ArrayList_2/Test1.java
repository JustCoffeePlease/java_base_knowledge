
package L20_ArrayList_2;

import java.util.Arrays;
// compare
// mismatch
public class Test1 {
    public static void main(String args[]) {
        int [] array_1 = {1, 2, 3, 4, 5};
        int [] array_2 = {1, 2, 3, 5};
        int [] array_5 = {1, 2, 3, 4, 5};
        
        char [] array_3 = {'p', 'r', 'i', 'v', 'e', 't'};
        char [] array_4 = {'p', 'r', 'i', 'v', 'i', 'v', 'k', 'a'};
        char [] array_6 = {'p', 'r', 'i', 'v', 'e', 't', 'a'};
        // compare
        System.out.println(Arrays.compare(array_1, array_2));
        // ���������� -1 ���� ������� �� ����������
        System.out.println(Arrays.compare(array_1, array_5));
        // ���������� 0 ���� ������� ����������
        System.out.println(Arrays.compare(array_3, array_4));
        // ���������� -4, ��� ��� array_3 < array_4
        System.out.println(Arrays.compare(array_3, array_6));
        
        // mismatch
        System.out.println("-------------------------------------------------");
        // ����� mismatch ���������� ������ ������� ����������� �������� ��� -1
        // ���� ��� ����������
        System.out.println(Arrays.mismatch(array_1, array_5));
        System.out.println(Arrays.mismatch(array_1, array_2));
        
        
    }
}
