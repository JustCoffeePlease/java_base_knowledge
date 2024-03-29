
package L17_stringbuilder;
class Car{};

public class Test1 {
    public static void main(String[] args){
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good day");
        StringBuilder sb3 = new StringBuilder(50); // ��������� �����������
        StringBuilder sb4 = new StringBuilder(sb2); // ��������� �� �� sb2, � �� ������, � ����� �� ���������, ��� � sb2

        System.out.println(sb3.length()); // ���������� ����� �������
        // � ������ ������ ���������� 0, ��� ��� ������� ������ ����������� �������, ��� �� ���� �� ����
        System.out.println(sb2.charAt(3)); // ���������� �������� �� ���������� �������

        System.out.println(sb2.indexOf(" ")); // ���������� ������ ���������� �������� � �������
        // ���������� -1, ���� ��������� ������ �� ������
        System.out.println(sb2.indexOf("o", 1)); // ���������� ������ ���������� �������� � �������, ������� � ������� 1

        String s = sb2.substring(5); // ���������� ������� �������, ������� � ����������
        System.out.println(s);

        String s2 = sb2.substring(5, 8); // ���������� ������� ������� � ��������� ��������
        System.out.println(s2);

        System.out.println(sb2.subSequence(5, 8)); // ��� substring, ������ ���������� �� String, � CharSequence

        sb2.append(22); // �������� ������. ��������� � ���� ��������� ��������
        System.out.println(sb2);

        sb2.append(new Car());
        System.out.println(sb2);

        System.out.println(sb2.insert(4, 55)); // ����� ��������� �� ������� (������ �����) �������� (������ �������� ������)

        System.out.println(sb2.insert(sb2.length(), "Hello")); // ������ ���� �����, ��� � append

        StringBuilder sb10 = new StringBuilder("Hello World");
//        sb10.delete(3, 6); // ������� �������� � ��������� ��������
//        System.out.println(sb10);
        sb10.deleteCharAt(6); // ������� ������, ��������������� ���������� �������
        System.out.println(sb10);

        sb10.reverse(); // ��������� ������� ������� � �������� �������
        System.out.println(sb10); // ����� �������� ������ ��� StringBuilder, �� ��� String
        
        StringBuilder sb12 = new StringBuilder("Hey everybody");
        sb12.replace(0, 3, "Hello"); // �������� ������� �� ��������� ���������� �� ��������� ��������
        System.out.println(sb12);
        
        System.out.println(sb12.capacity()); // ���������� ������� ����������� �������
    }
}
