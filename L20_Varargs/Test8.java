
package L20_Varargs_ForEach;

public class Test8 {
    public static void main(String[] args){
        int[] array = new int[4];
//        for(int i = 0; i < array.length; i++){
//            array[i] = i * 10;
//        }
        for(int b: array){
            b = 10;
        }
        for(int a: array){
            System.out.print(a + " ");
        }
    }
}
