
package L17_stringbuilder;

public class Test4 {
    public static void main(String[] args){
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuffer sb2 = new StringBuffer("Goodbuy");
        
        String s1 = new String(sb1);
        String s2 = new String(sb2);
    }
        
}
