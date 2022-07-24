
package L21_garbage_collection;

public class Test2 {
    public static void main(String[] args){
        String s1, s2;
        s1 = new String("Hello");
        s2 = new String("Goodbue");
        s1 = s2; 
        String s3 = s1;
        s1 = null;
    }
}
