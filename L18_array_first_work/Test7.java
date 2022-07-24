
package L18_array_first_work;

public class Test7 {
    public static void main(String[] args){
        char [] array = {'h', 'e', 'l', 'l', 'o'};
        String s = new String(array);
        
//        System.out.println(s);
        StringBuilder sb = new StringBuilder("Hello World");
        
        // Метод append 
//        sb.append(array, 2, 3); // Значение 2 - с какой позиции будем добавлять, 3 - сколько символов добавим
//        System.out.println(sb);
        
        // Метод insert
        sb.insert(2, array, 1, 3);
        System.out.println(sb); // Значение 2 - на какую позицию добавляем, добавляем array с первой позиции 3 элемента-х
        
    }
}
