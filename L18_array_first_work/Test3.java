
package L18_array_first_work;
// Exceptions
public class Test3 {
    
    static String s;

    public static void main(String[] args){
        int [] array = new int[3];

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        // ArrayIndexOutOfBoundsException
        // array[3] нет, поэтому при запускке возвращается Exception
        // В котором говориться, что мы вышли за рамки массива
//        array[3] = 5;

        // NullPointerException
        int [][] array_2 = new int [3][];
        System.out.println(array_2[0][1]);
        System.out.println(s.length());

    }
}
