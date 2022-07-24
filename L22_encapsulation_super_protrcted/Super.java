
package L22_encapsulation_super_protrcted;

public class Super {}

class X{
    public X(String s){
        System.out.println(s);
    }
}

class Y extends X{
    public Y(){
    super("OK");
    System.out.println("Hello");
    }
}

class SuperTest{
    public static void main(String[] args){
        Y test = new Y();
// При инициализации переменной test в классе Y, благодаря super происходит
// ссылка на родительский класс Х, где выводится на печать переданный аргумент.
// Только после этого выполняется печать Hello

// Если в ручную не написать super, то компилятор дописывает его сам, обращаясь
// к конструктору без параметров super класса

// Выражение super и this не могут одновременной находиться в теле конструктора
    }
}