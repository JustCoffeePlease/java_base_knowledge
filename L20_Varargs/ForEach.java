
package L20_Varargs_ForEach;

public class ForEach {
    public static void main(String[] args){
        int[] array = {0, 6, 4, 1};
        
//        for(int i = 0; i < array.length; i++){
//            System.out.print(array[i] + " ");
//        }
        // Использование for each loop (Обычно используется для массивов)
        for(int i:array){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
