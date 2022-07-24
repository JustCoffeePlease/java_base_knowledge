
package L27_exceptions;

import java.io.*;

public class Test6 {
    public static void main(String[] args){
        try{
            File f = new File("Non_existent.txt");
            FileInputStream fis = new FileInputStream(f);
        }
        catch(FileNotFoundException e){
            System.out.println("FileNotFoundException has been found");
        }
        catch(NullPointerException e){
            System.out.println("NullPointerException has been found");
        }
        catch(IOException e){
            System.out.println("IOException has been found");
        }
        catch(Exception e){
            System.out.println("Exception has been found");
        }
        catch (Throwable e){
            System.out.println("Throwable has been found");
        }
    }
}
