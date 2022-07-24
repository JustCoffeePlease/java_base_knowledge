
package L16_about_string_1;

public class Test1 {
    
    public static void main(String[] args){
        String s1 = new String("HelloHellooo");
        
        int a = s1.length(); // Возвращает длину объекта
        System.out.println(a);
        
        char c1 = s1.charAt(3); // Возвращает, какое значение char находится на указанном индексе
        System.out.println(c1); 
        
        int i1 = s1.indexOf("o");
        System.out.println(i1);
        
        int i2 = s1.indexOf("lo");
        System.out.println(i2);
        
        int i3 = s1.indexOf("o", -2);
        System.out.println(i3);

        boolean b1 = s1.startsWith("He");
        System.out.println(b1);
        
        boolean b2 = s1.startsWith("Ell");
        System.out.println(b2);

        boolean b3 = s1.startsWith("He", 5);
        System.out.println(b3);        
        
        boolean b4 = s1.endsWith("oo");
        System.out.println(b4);
        
    } 
}
