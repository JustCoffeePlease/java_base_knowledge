
package Lesson_9;

public class Car {
    //����������
    int z = 5;
    
    
    int a = 10;
    String color;      //  ����������, ������� �����
    String engine;     //  ������ ������ � ������ �������
    static int count;  //  ����� �����. ����������� �� �������, � ����� ������
    // �����������
    // ������ ������� ���������� 1
    Car(String color2, String engine2, int number){
        count++; //��� �������� �������, ����������� count �� 1
        color = color2;
        engine = engine2;
    }
    // ������ ������� ���������� 2
    // ���������� this ����� �� ������ �������� ����������
    Car(String color, String engine){
        count++; //��� �������� �������, ����������� count �� 1
        int x = 5;          // ��� ��������� ����������, ������� 
        int y = x + 10;     //              ����� ������ � ���������� ������������
        this.color = color;
        this.engine = engine;
    }    
    // ������
    public void showColor(){
        System.out.println("Cars color is " + color);
        changeColor("Red");
    }
    public void changeColor(String color3){
        System.out.println("Cars color is changed");
        int price = 5000;
        this.color = color3;
        price += 1000;
    }
    public static void changeA(int b){
//        this.a = b; ���������� ������, ��� ��� ����� �������� �����������
//                    �� ����� �������������� ��� �������� �������
//                    ���������� � ����� ���� ������������ ������
//                    ��� ������� �������
          Car c = new Car("Black", "V8");
          c.a = b;
    }
    
//    int a = price; ���������� �� ��������, ������ ������� price
//                   ��� ���������� ����� ������ ������ ������ ������
    
    void abc(int a, int b){
        boolean c = true;
    }
    // ���������� � � b � � ����� ������ ������ �������.
    void abcd(int a, int b){
    }
    void change_color(String color){
    System.out.println(color);
    }
}
    

