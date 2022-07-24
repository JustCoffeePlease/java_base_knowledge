
package L18_array_first_work;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args){
        int array_1[] = {1, 9, 3, -8, 0, 5, 4, 1};
        
        for (int i = 0; i < array_1.length; i++){
            System.out.print(array_1[i] + " ");   
        }
        System.out.println();
        System.out.println("------------------------------");
        
        // ћетод сортировки массива
        Arrays.sort(array_1);
        
        for (int i = 0; i < array_1.length; i++){
            System.out.print(array_1[i] + " ");   
        }
        System.out.println();
        System.out.println("------------------------------");
        
        // ћетод выполн€ет поиск определенного значени€ в определенном массиве
        //  орректно работает только в отсортированном массиве
        int index_1 = Arrays.binarySearch(array_1, -8);
        System.out.println(index_1);
    }
}
