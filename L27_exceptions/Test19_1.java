
package L27_exceptions;
import java.io.*;
public class Test19_1 {
    public static void main(String[] args) throws IOException, Exception{
        Animal a = new Mouse();
    }
}

class Animal {
    Animal() throws FileNotFoundException{}
}

class Mouse extends Animal {
//   Mouse() throws FileNotFoundException {
//       super();
//   }
   Mouse() throws IOException, Exception {
       super();
   }    
}


//class Human{
//    String name;
//    int age;
//    
//    Human(String name, int age){
//        if(age < 0){throw new Exception("incorrect age");
//        }
//        this.name = name;
//        this.age = age;
//    }
//}