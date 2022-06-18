
package Lesson_3;

public class Test8 {
       public static void main(String[] args){
           int a = 10;
           int b = 3;
       
       
//           int c = ++a - b * 2; // 11 - 3 * 2
//           int d = (++a - b) * 2; // (12 - 3) * 2
//           int e = (a-- - b) * 2; // (12 - 3) * 2
//           int f = (a-- - b) * 2; // (11 - 3) * 2
//                System.out.println(c);
//                System.out.println(d);
//                System.out.println(e);
//                System.out.println(f);
            
            char j = 'a';
            int i = 10;
                  System.out.println(j + i); // ¬озвращает 107, так как буква
                                             // "а" имеет такой номер в unicode
                  System.out.println(j % i);
             
            boolean b1 = false;
            boolean b2 = b1 ==true;
                    System.out.println(b2); // false
            
            boolean b3 = false;
            boolean b4 = b3 = true;
                    System.out.println(b4); // True
       }
    
}
