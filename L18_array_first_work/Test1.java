
package L18_array_first_work;

public class Test1 {
    public static void main(String[] args){
        // Declaration
        int [] array_1;
        String [] array_2;
        double [][] array_3;

        double [] array_7;
        int [][] array_10;

        // Alocation
        // Указываем длину массива
        array_1 = new int[8];
        array_2 = new String[3];
        array_3 = new double [4][2];
        array_7 = new double [2];
        
        array_10 = new int [3][];

        // У String length это метод, а у array это переменная (Атрибут класса)
        System.out.println(array_2.length);
        
        // Initialization
        array_2[0] = "Hello";       //  |
        array_2[1] = "Goodbue";     //  | Static Initialization
        array_2[2] = "How are you"; //  |
        
        // Ремарочка
        double [] array_5;
        array_5 = new double[2];
        array_5[0] = 2.5;
        array_5[1] = 3.5;
       
        array_3[1] = array_5; // Первому элементу одномерного массива присваивается другой одномерный массив
        array_7 = array_5;
        
        System.out.println(array_3[1][0]);
        
        // --------------------------------------------------------
        // Dynamic initialization in Test2 file
        
        
        
    }
}
