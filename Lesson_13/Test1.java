
package Lesson_13;

public class Test1 {
    
}

class Student{
    
    int grade;
    
    Student(int grade){
    
        this.grade = grade;
    }
    
    public static void main(String[] args){
        
        Student st1 = new Student(3);
//        if (st1.grade == 2){
//            System.out.println("������� ��������");}
//        else if (st1.grade == 3){
//            System.out.println("������� ��������");}
//        else if (st1.grade == 4){
//            System.out.println("������� �������");}
//        else if (st1.grade == 5){
//            System.out.println("������� ��������");}  
//        else {
//            System.out.println("������ �������");}
//    }
//            SWITCH STATEMENT
          switch(st1.grade){
              case 2:
                  System.out.println("������� ��������");
                  break;
              case 3:
                  System.out.println("������� ��������");
                  break;
              case 4:
                  System.out.println("������� �������");
                  break;
              case 5:
                  System.out.println("������� ��������");
                  break;
              default:
                  System.out.println("������ �������");
                  
          }
    }
}