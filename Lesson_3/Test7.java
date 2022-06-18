
package Lesson_3;

public class Test7 {
    public static void main(String [] args){
    
         // !true = false; !false = true
         
    boolean a = true;
    boolean b = false;
         
//         System.out.println(!a);
//         System.out.println(!b);
    
    int c = 10;
    int d = 5;
    int f = 0;
    int g = 100;
    
    boolean e = !(c > d);
    
    boolean h = c < d && f++ == g; // true && false 
                        // Сначала f сравнивается с g,
                        // а потом увеличивается на единицу 
    System.out.println(f);
                        
//        System.out.println(e);
//        System.out.println(h);
      

    // & ; | Проверяются все элементы выражения в любом случае
    //       Так же, есть возможность работы с числами
    
    int x = 10;
    int y = 5;
    
    System.out.println(x & y);
    System.out.println(x | y);

    
    // ^ Оператор --> true ^ true ^ true    =    false
    //                false ^ false ^ false =    false
    //                true ^ false ^ true   =    false
    //                false ^ false ^ true  =    true
                    
    boolean b1 = true;
    boolean b2 = false;    
    boolean b3 = false;    
    boolean b4 = false;    
    
    System.out.println(b1 ^ b2 ^ b3 ^ b4);
    
    }
}
