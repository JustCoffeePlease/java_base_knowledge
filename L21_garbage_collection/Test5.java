package L21_garbage_collection;

public class Test5 {

    void abc(int i) {
        System.out.println(i);
    }

    public static void main(String[] args) {
        Test5 t = new Test5();
        char c = 'a';
        System.out.println('b' + 10);
        // ������ ���������� ����p b = 98
    }
}
