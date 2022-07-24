
package L27_exceptions;

public class Test4 {
    public static void main(String[] args){
        int [] array = {4, 8, 1};
        System.out.println("We have massive");
        
        try{
//            System.out.println(array[1]);
            System.out.println(array[5]);
            System.out.println("Have a nice day");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exceprion has been catched: " + e);
        }
        finally{
            System.out.println("This is finally block");
        }
        
        System.out.println("This block is not related to the block Exceprion");
    }
}
