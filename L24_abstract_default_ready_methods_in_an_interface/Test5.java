//package L24_abstract_default_ready_methods_in_an_interface;
//
//public class Test5 {
//
//}
//
//interface I1 {
//
//    void abc();
//
//// ���� � ���������� ������� default, �� ��� ����� ����� ����
//// ���� � ���������� ������� �� default, �� ��� ���� ����� �� �����
//    default void def() {
//        System.out.println("This is 'def' method");
//    }
//}
//
//class Z implements I1 {
//
//    public void abc() {
//        System.out.println("This is 'abc' method");
//        Z z = new Z();
//        z.abc();
//        z.def();
//
//    }
//}
