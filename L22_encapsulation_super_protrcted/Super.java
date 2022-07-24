
package L22_encapsulation_super_protrcted;

public class Super {}

class X{
    public X(String s){
        System.out.println(s);
    }
}

class Y extends X{
    public Y(){
    super("OK");
    System.out.println("Hello");
    }
}

class SuperTest{
    public static void main(String[] args){
        Y test = new Y();
// ��� ������������� ���������� test � ������ Y, ��������� super ����������
// ������ �� ������������ ����� �, ��� ��������� �� ������ ���������� ��������.
// ������ ����� ����� ����������� ������ Hello

// ���� � ������ �� �������� super, �� ���������� ���������� ��� ���, ���������
// � ������������ ��� ���������� super ������

// ��������� super � this �� ����� ������������� ���������� � ���� ������������
    }
}