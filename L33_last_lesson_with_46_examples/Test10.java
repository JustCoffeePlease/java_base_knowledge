
package L33_last_lesson_with_46_examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test10 {
        public static void main(String[] args) {
        int a = abc();
        System.out.println(a);
    }
    
    static int abc(){
        try{
            FileInputStream fis = new FileInputStream("nonexistent_file.txt");
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
            return 17;
        }
        finally{
            System.out.println("This is finally block");
//            return 16;
        }
        System.out.println("Continue");
        return 18;
    }
}
