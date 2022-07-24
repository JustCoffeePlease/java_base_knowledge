
package L27_exceptions;
import java.io.*;
public class Test14 {
    static FileInputStream fis1, fis2;
    public static void main(String[] args){
        try{
            fis1 = new FileInputStream("ZaurTest.txt");
            System.out.println("The file exists and is found in the system");
            try{
                fis2.close();
            }
            catch(IOException e){
                System.out.println("There are problems with stream fis2");
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(NullPointerException e){
            System.out.println("Caught NullPointerException");
        }
    }
}
