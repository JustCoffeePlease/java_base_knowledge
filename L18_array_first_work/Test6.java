
package L18_array_first_work;

public class Test6 {
    
    public static void maxMin(double [] array){
        double max = array[0];
        double min = array[0];
        
        for(int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
        }  
        
        System.out.println("minimum in array: " + min);
        System.out.println("maximum in array: " + max);

    }
    
    public static void main(String[] args){
        double [] array_1 = {1.05, -3.14, 8.0, 9.19, -3.0, 0};
        maxMin(array_1);
        
        System.out.println("-----------------------------------");
        
        maxMin(new double [] {2.5, 5.0, 6.9}); 
    }
}
