
package L20_Varargs_ForEach;

public class Test2 {
//    static void summ(int a, int b){
//        System.out.println(a + b);
//    }
//        static void summ(int a, int b, int c){
//        System.out.println(a + b + c);
//    }
//        static void summ(int a, int b, int c, int d){
//        System.out.println(a + b + c + d);
//    }      
    // ����������� ������ ��� ��������������� ���������� input
//    static void summ(int ... a){
//        int summ = 0;
//        for (int i = 0; i < a.length; i++){
//            summ += a[i];
//        }
//        System.out.println(summ);
//    }
//    
    // ����������� ������ � �������������� ������� 
    static void summ(int[] a){
        int summ = 0;;
        for (int i = 0; i < a.length; i++){
            summ +=a[i];
        }
        System.out.println(summ);
    }
    public static void main(String[] args){
//        summ(6, 3, 1);
        // ��� ������ � ����� ������� ������ ������� ������ ���� �����
        summ(new int[] {3, 5});
    }
    
    public void abc(int[] ... array){
    // ��� ������ ������ abc, � ��� �������� ����� ���� ������ �� ���������, ����
    // ��������� ����� ������ ����� �������� ���� int
    }
}
