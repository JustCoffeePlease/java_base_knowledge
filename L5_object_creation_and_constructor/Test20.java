
package L5_object_creation_and_constructor;

public class Test20 {
    
    int summ(int a, int b, int c){
    int result = a + b + c;
//    String s = "Hello";
    return result;
    // ���������� ����� ����� �� ��� ������, ����� ������ � �������
    }
    
    int Function(int a1, int b1, int c1){
       int result2 = summ(a1, b1, c1) / 3;
       return result2;
    }
}

class Test21{
    
    public static void main(String[] args){
        Test20 t = new Test20();
        // ����������� ������ ���������� ��� �� ��� � ����� 
        int ThreeNumberSumm = t.summ(1, 2, 3);
        // System.out.println(ThreeNumberSumm);

        System.out.println(t.Function(20, 40, 60));
        
    }
}