
package L27_exceptions;

import java.io.*;

public class Test4_3 {
    void abc(){
        int [] array = {1, 2};
        System.out.println(array[5]);
    }
    void def() throws ArrayIndexOutOfBoundsException{
        abc();
    }
    
    public static void main(String[] args){
        Test4_3 t = new Test4_3();
        try{t.def();}
        catch(ArrayIndexOutOfBoundsException e){
            
//            IOException f = e;

//            System.out.println("Exception has been catched");
//            System.out.println(e);
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }
            
    }
}
