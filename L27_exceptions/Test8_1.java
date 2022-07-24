
package L27_exceptions;

import java.io.*;


public class Test8_1 {
    static StringBuilder abc(){
        StringBuilder a = new StringBuilder("Hello");
        try{
//            File f = new File("ZaurTest.txt");
            File f = new File("Non_existent.txt");            
            FileInputStream fis = new FileInputStream(f);
//            return 5;
        }
        catch(FileNotFoundException e){
            System.out.println("Exception has been catched");
            System.out.println("CATCH BLOCK: the variable a is equal to " + a);
            return a;
        }
        finally{
            a.append("!!!");
            System.out.println("This is finally block");
            System.out.println("FINALLY BLOCK: the variable a is equal to " + a);
            return a;
        }    
    }
    
    public static void main(String[] args){
        System.out.println(abc());
    }        
}
