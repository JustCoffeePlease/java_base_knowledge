
package L16_about_string_1;

public class Test2 {
    
    public static void main(String[] args){
        String s1 = new String("HelloHellooo");
                
        String s10 = s1.substring(3);
        System.out.println(s10);
        System.out.println(s1);
        
        String s11 = s1.substring(5,10);
        System.out.println(s11);
        
        String s12 = s1.trim();
        System.out.println(s12); // Убирает пробелы по бокам
        
        String s14 = s1.replace("Hello", "Goodbue");
        System.out.println(s14);
        
        String s2 = "Goodbue";
        String s3 = s2.replace('b','b');
        System.out.println(s2 == s3); // сравниваем адреса объектов
        
        String s5 = "Hello ";
        String s6 = "friend";
        System.out.println(s5.concat(s6));
        

        
    } 
}
