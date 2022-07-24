

package L27_exceptions;
import java.io.*;
public class Test7 {
    public static void main(String[] args){
        StringBuilder result = new StringBuilder("");
        try{
            File f = new File("ZaurTest.txt");
//            File f = new File("Non_existent.txt");
            System.out.println("Object is created");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Stream is created");
            int counter = 0;
            while(true){
                counter++;
                result.append(fis.read());
                System.out.println("Information is reading");
                if (counter == 3){fis.close();}
            }
        }
        catch(FileNotFoundException e){
            System.out.println("FileNotFoundException is catched");
        }
        catch(IOException e){
            System.out.println("IOException is catched");
        }
        finally {
            System.out.println("This is finally block");
        }
    }
}
