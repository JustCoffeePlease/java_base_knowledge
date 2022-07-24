
package L33_last_lesson_with_46_examples;

public class Test2 {}

class A{
    public A(){
        str1 = abc("String1");
    }
    static String str1 = abc("String2");
    String str3 = abc("String3");
    {str1 = abc("String4");}
    static {str1 = abc("String5");}
    static String str2 = abc("String6");
    String str4 = abc("String7");
    
    public static void main(String[] args) {
        A a = new A();
    }
    
    static String abc(String str){
        System.out.println(str);
        return str;
    }
}

// Output:
//  String2
//  String5
//  String6
//  String3
//  String4
//  String7
//  String1