
package Lesson_9;

public class Car {
    //Переменные
    int z = 5;
    
    
    int a = 10;
    String color;      //  Переменные, которые видны
    String engine;     //  внутри класса и внутри методов
    static int count;  //  Видна везде. Принадлежит не объекту, а всему классу
    // Конструктор
    // Способ задания переменных 1
    Car(String color2, String engine2, int number){
        count++; //При создании объекта, увеличивает count на 1
        color = color2;
        engine = engine2;
    }
    // Способ задания переменных 2
    // Используем this чтобы не менять название переменных
    Car(String color, String engine){
        count++; //При создании объекта, увеличивает count на 1
        int x = 5;          // Это локальные переменные, которые 
        int y = x + 10;     //              видны только в конкретном конструкторе
        this.color = color;
        this.engine = engine;
    }    
    // Методы
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
//        this.a = b; Возвращает ошибку, как как метод является статическим
//                    Он может использоваться без создания объекта
//                    Переменная а может быть использована только
//                    при наличии объекта
          Car c = new Car("Black", "V8");
          c.a = b;
    }
    
//    int a = price; Компилятор не понимает, откуда взялась price
//                   Эта переменная видна только внутри своего метода
    
    void abc(int a, int b){
        boolean c = true;
    }
    // ПЕРЕМЕННЫЕ а и b и с видны только внутри методов.
    void abcd(int a, int b){
    }
    void change_color(String color){
    System.out.println(color);
    }
}
    

