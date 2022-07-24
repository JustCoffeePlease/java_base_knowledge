
package L20_Varargs_ForEach;

public class Test9 {
    public static void main(String[] args){
        int[] array_1 = {3, 1, -2, 0};
        int[] array_2 = {-9, 1, 5, 2};
        for(int i = 0; i < array_1.length && i < array_2.length; i++){
            array_1[i] = 12;
            array_2[i] = 3;
        }
    }
}
