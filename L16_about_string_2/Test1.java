
package L16_about_string_2;

// isBlank  // ���������� true ���� ������ ����� ������� � tab � �� ����� ������ ��������
// isEmpty  // ���������� true, ���� �� ����� ���� � ������ string��
// strip, stripLeading, stripTrailing
    // strip �������� ��� trim, ������ �����
    // stripLeading ������� ������� ������ � ������
public class Test1 {
    public static void main(String[] args){
        String s1 = "Hello";
        System.out.println(s1.isBlank());
        
        String s2 = "   ";
        System.out.println(s2.isBlank());
        
        String s3 = "";
        System.out.println(s3.isEmpty());
        
        String s4 = "   Hello   ";
        System.out.println(s4.strip());
        System.out.println(s4.stripLeading());

    }
}
