
package Lesson_8;


public class StudentUpdated {
    
    //����������
    String name;
    int course;
    static int count = 0;
    int a;

    
    //�����������
    public StudentUpdated(String name2, int course2){
        count++;
        name = name2;
        course = course2;
        System.out.println("Student # "+ count + " is created");
    }
    
    // ������
    public static void showCount(){
        System.out.println("All students created " + count);
    }
    
    public void showInfo(){
        System.out.println("Welcome to the best univercity");
    }
    
    void abc(){
    a++;
    count++;
    }
    
    static void abcd(){
    count++; // ���������� count ���������� � ����������� ���� � �� ���������
//    a++;   � �������. ��� ������������� ���������� � ������ ���� ������ ������
//           � ����������� ������ ������ ����� �� ������������, ����� ���������� 
//           ���������� ���������� �
    StudentUpdated st2 = new StudentUpdated("Petr", 1);
    st2.a++;
    }
    
    public static void main(String[] args){
    // main �������� ������ ��� �� �������� ������ ������� ���� ���������  
        abcd();
        StudentUpdated st3 = new StudentUpdated("Ivan", 4);
        st3.abc(); // ���������� �������� abc ��� ������������� �������
    }
}

