
package Lesson_9;

public class MyCar {
    
    public static int a = 10;
    String engine;
    String color;
    static int count;
    
   public MyCar(String color, String engine){
        
        this.count++;
        this.color = color;
        this.engine = engine;
    }
    
    void change_color(String color){ // color � ������ ��� ���� ����������, 
                                     // � �� ���������� ������
        this.color = color;          // � ��� ������ ���������� ������
                                     // �������������� � ���������� ������
        System.out.println(color);
    }
    
    public static void main(String[] args){
        
        MyCar c = new MyCar("Red", "V6");
        System.out.println(c.color);
        c.change_color("black");
        System.out.println(c.color);
    }
}

