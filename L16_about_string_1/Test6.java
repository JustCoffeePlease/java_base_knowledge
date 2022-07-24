
package L16_about_string_1;

public class Test6 {
    public static void main(String[] args){
        String s = "Hello";
        
        String s2 = s.toLowerCase();
        System.out.println(s2);
        
        String s3 = s.toUpperCase();
        System.out.println(s3);

        boolean b = s.contains(":2"); // Содержит ли объект значение, указанное в скобках
        System.out.println(b);
    }
}
