
package L27_exceptions;

import java.io.*;

public class Test4_2 {
//        void abc(){
//            File f = new File("Non_existent.txt");
//            try{
//                FileInputStream fis = new FileInputStream(f);
////                fis.read();
//                System.out.println("Have a nice day");
//            }
//            catch(FileNotFoundException e){
//                System.out.println("Exceprion has been catched: " + e);
//            }
//        }
        void abc() throws FileNotFoundException{
            File f = new File("Non_existent.txt");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Have a nice day");

        }        
//        void def(){
//            System.out.println("Hello");
//            abc();
//        }
        
        void ghi(){
            String s = null;
            System.out.println(s.length());
        }
        
        void def(){
            System.out.println("Hello");
            try{
            abc();
            }
            catch(FileNotFoundException e){
                System.out.println("Exceprion has been catched");
            }
        }        
    
        public static void main(String[] args){
            Test4_2 t = new Test4_2();
            t.def();
    }    
}
