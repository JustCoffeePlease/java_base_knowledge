
package L26_equals_toString_Wrapper_classes;

public class Test4 {
//    static void abc(String s){System.out.println("A");}
    static void abc(String ... s){System.out.println("B");}
    static void abc(Object s){System.out.println("C");}
    static void abc(String s1, String s2){System.out.println("D");}
    
    
    static void def(Long a){System.out.println("E");}
    static void def(Long ... a){System.out.println("F");}
    static void def(Object a){System.out.println("G");}
    static void def(Integer a){System.out.println("H");}


    public static void main(String[] args){
        Test4 t = new Test4();
        t.abc("Ok");
        t.def(501);
    }
}
