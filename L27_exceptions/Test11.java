
package L27_exceptions;
import java.io.*;
public class Test11 {
    FileInputStream fis1, fis2;
    public void abc(){
        try{
            fis1 = new FileInputStream("ZaurTest.txt");
            try{
                fis2 = new FileInputStream("Non_existent.txt");
            }
            catch(FileNotFoundException e){
                System.out.println("File Non_existent.txt not found");
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File ZaurTest.txt not found");
        }
        finally{
            System.out.println("This is an external finally block");
            try{
                fis1.close();
                fis2.close();
            }
            catch(IOException e){
                System.out.println("An exception was found in finally block");
            }
        }
    }
    
    public static void main(String[] args){
        Test11 t = new Test11();
        t.abc();
    }
}
