
package L24_abstract_default_ready_methods_in_an_interface;

public class Test2 {
//    public static void main(String[] args){
//        // Абстрактные классы не могут иметь объекты
////        Figure f = new Figure(); // ОШИБКА
//        Figure f1 = new Quadro(4);
//        // Таким образом, f1 может обращаться только к тем методам, которые есть у Figure
//        System.out.println(f1.number_of_sides); // Берется из Figure
//        f1.area(); // берется из Quadro
//    }
//    
}

// Если в классе есть abstract метод, то сам класс тоже должен быть abstract
// Не может быть final
//abstract class Figure{
//    int number_of_sides = 0;
//    
//    Figure(int number_of_sides){
//        this.number_of_sides = number_of_sides;
//    }
//    // метод без тела всегда abstract
//    abstract void perimeter();
//    abstract void area();
//    
//    void showInfo(){System.out.println("This is figure");}
//}
//// Дочерний класс должен перезаписать все методы abstract либо сам быть abstract
//class Quadro extends Figure{
//    int number_of_sides = 4;
//    int side = 10;
//    // У абстрактных классов могут быть конструкторы
//    Quadro(int number_of_sides){
//        super(number_of_sides);
//        this.number_of_sides = number_of_sides;
//    }
//    
//    public void perimeter(){
//        System.out.println("Quadro Perimeter = " + 4 * side);
//    }
//    public void area(){
//        System.out.println("Quadro Area = " + side * side);
//    }
//}
//class Rectangle extends Figure{
//    int number_of_sides = 4;
//    int side_1 = 8;
//    int side_2 = 5;
//    
//    public void perimeter(){
//        System.out.println("Rectangle Perimeter = " + 2 * side_1 + 2 * side_2);
//    }    
//    public void area(){
//        System.out.println("Rectangle Area = " + side_1 * side_2);
//    }
//    
//}
//class Circle extends Figure{
//    int number_of_sides = 0;
//    int radius = 3;
//    
//    public void perimeter(){
//        System.out.println("Circle Perimeter = " + 2 * 3.14 * radius);
//    }    
//    public void area(){
//        System.out.println("Circle Area = " + 3.14 * radius * radius);
//    }
//}
//
//abstract class Rect extends Figure{
//    void def(){System.out.println("This is Rectangle");}
//}