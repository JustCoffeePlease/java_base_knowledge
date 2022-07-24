
package L27_exceptions;

import java.io.*;

public class Test4_1 {
        public static void main(String[] args){
//        public static void main(String[] args) throws FileNotFoundException{  // Используем такую запись, если было решено не пользоваться конструкцией try catch   
            File f = new File("ZaurTest.txt");
//            File f = new File("Non_existent.txt");
            try{
                FileInputStream fis = new FileInputStream(f);
                fis.read();
                System.out.println("Have a nice day");
            }
            catch(FileNotFoundException e){
                System.out.println("Exceprion has been catched: " + e);
            }
            catch(IOException e){
                System.out.println("Exception has been catched: " + e);
            }
            catch(NullPointerException e){
                System.out.println("Exceprion has been catched: " + e);
            }
            finally{
                System.out.println("This is finally block");
            }
            
            System.out.println("This block is not related to the block Exceprion");
    }
}
