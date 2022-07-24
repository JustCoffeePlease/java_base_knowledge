
package L33_last_lesson_with_46_examples;
import java.io.*;
public class Test8 {
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
        }
        finally{
            System.out.println("This is finally block");
        }
        System.out.println("Continue");
        return 18;
    }
}
