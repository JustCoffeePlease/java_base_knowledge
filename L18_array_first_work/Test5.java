
package L18_array_first_work;

public class Test5 {
    public static void main(String[] args){
        int array_1[] = {1, 9, 3, -8, 0, 5, 4, 1};
        int array_2[] = {1, 9, 3, -8, 0, 5, 4, 1};
        int array_3[] = array_2; // array_3 будет ссылаться на тот же объект, что и array_3     
        
        System.out.println(array_1 == array_2); // Переменные ссылаются на разные объекты, поэтомы возвращается false
        System.out.println(array_3 == array_2);
        
        System.out.println(array_3.equals(array_2)); // equals работает точно так же как ==
    }
}
