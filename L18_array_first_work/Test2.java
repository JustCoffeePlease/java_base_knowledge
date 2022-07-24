
package L18_array_first_work;

public class Test2 {
    public static void main(String[] args){
        String [] array_1;
        int [][] array_2;
        
        array_1 = new String[3];
        array_2 = new int[3][];
        
        // Dynamic initialization
        for (int i = 1; i < array_1.length; i++){
            array_1[i] = "Hello" + i;
                System.out.println(array_1[i]);
        }
        
        // Нулевой элемент array_2 будет равен массиву с длинной 5
        // Первый элемент будет массиву с длинной 2
        // Второй элемент будет равен массиву с длинной 7
        array_2[0] = new int[5];
        array_2[1] = new int[2];
        array_2[2] = new int[7];
        
        for (int i = 0; i < array_2.length; i++){
            for (int j = 0; j < array_2[i].length; j++){
                array_2[i][j] = i + j;
                System.out.println(array_2[i][j]);
            }
        }
        
        
    }
}
