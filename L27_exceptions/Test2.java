
package L27_exceptions;

public class Test2 {
    void abc() throws NullPointerException{
        String s = null;
        System.out.println(s.length());
    }
    
    public static void main(String[] args){
        int array [] = {1, 4, 0};
//        try{ System.out.println(array[5]);}
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Exception caught");
//        }
        if (5 >= 0 && 5 < array.length){System.out.println(array[5]);}
    }
}
