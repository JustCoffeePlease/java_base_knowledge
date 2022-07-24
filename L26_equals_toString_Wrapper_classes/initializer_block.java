
package L26_equals_toString_Wrapper_classes;

public class initializer_block {
    initializer_block(){
        System.out.println("This is consctructor1");
    }
    initializer_block(int a){
        this();
        System.out.println("This is consctructor2");
    }    
    String s1;
    
    // initializer_blocks
    {
        s1 = "OK";
        System.out.println("This is initialaizer block 1");
        int a = 5;
        System.out.println(a);
    }
    {
        System.out.println("This is initialaizer block 2");
    }
    
    static {
        System.out.println("This is static initialaizer block 1");
    }
    static {
        System.out.println("This is static initialaizer block 2");
    }
    
    public static void main(String[] args){
        initializer_block t = new initializer_block();
        initializer_block t1 = new initializer_block(3);        
    }
}
