
package L6_overloading_This;

public class MethodOVerloading2 {
    
    int sum(int i1, int i2){
        return i1 + i2;
    }
    
    String sum(String s1, String s2){
        return s1 + s2;
    }    
}

class MethodOverloading2Test{
    public static void main(String[] args){
        MethodOVerloading2 mO2 = new MethodOVerloading2();
        
        int a = mO2.sum(5, 7);
        System.out.println(a);
        String s = mO2.sum("Hello! ", "How are you?");
        System.out.println(s);
    }
}