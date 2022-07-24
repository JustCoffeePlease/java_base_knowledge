
package L27_exceptions;
import java.io.*;
public class Test9 {
    void abc()throws FileNotFoundException {
        StringBuilder a = new StringBuilder("Hello");
        try{
//            File f = new File("ZaurTest.txt");
            File f = new File("Non_existent.txt");            
            FileInputStream fis = new FileInputStream(f);
        }
        catch(FileNotFoundException e){
            System.out.println("Exception has been catched and updated");
            throw e;
        }
        finally{
            System.out.println("This is finally block");
        }    
    }
//    void def()throws FileNotFoundException {
//        StringBuilder a = new StringBuilder("Hello");
//        try{
//            int [] array = {1, 2, 3};
//            System.out.println(array[5]);
//        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Exception has been catched and updated");
//            throw e;
//        }
//        finally{
//            System.out.println("This is finally block");
//        }    
//    }  
    // Либо такая запись
//    void method()throws FileNotFoundException{
//        abc();
//    }
    // Либо такая
    void method(){
        try{
        abc();}
        catch (FileNotFoundException e){
            System.out.println("Exception has been catched and updated");
        }
    }    
    public static void main(String[] args){
    }      
}
