
package Lesson_8;


public class StudentUpdated {
    
    //Переменные
    String name;
    int course;
    static int count = 0;
    int a;

    
    //Конструктор
    public StudentUpdated(String name2, int course2){
        count++;
        name = name2;
        course = course2;
        System.out.println("Student # "+ count + " is created");
    }
    
    // Методы
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
    count++; // переменная count существует в статическом виде и не привязана
//    a++;   к объекту. Для существования переменной а должен быть создан объект
//           в статическом методе объект может не существовать, поэто невозможно 
//           разместить переменную а
    StudentUpdated st2 = new StudentUpdated("Petr", 1);
    st2.a++;
    }
    
    public static void main(String[] args){
    // main статичен потому что он является точкой запуска всей программы  
        abcd();
        StudentUpdated st3 = new StudentUpdated("Ivan", 4);
        st3.abc(); // Невозможно записать abc без использования объекта
    }
}

