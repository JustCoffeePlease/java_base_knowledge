
package L18_array_first_work;

public class Test7 {
    public static void main(String[] args){
        char [] array = {'h', 'e', 'l', 'l', 'o'};
        String s = new String(array);
        
//        System.out.println(s);
        StringBuilder sb = new StringBuilder("Hello World");
        
        // ����� append 
//        sb.append(array, 2, 3); // �������� 2 - � ����� ������� ����� ���������, 3 - ������� �������� �������
//        System.out.println(sb);
        
        // ����� insert
        sb.insert(2, array, 1, 3);
        System.out.println(sb); // �������� 2 - �� ����� ������� ���������, ��������� array � ������ ������� 3 ��������-�
        
    }
}
