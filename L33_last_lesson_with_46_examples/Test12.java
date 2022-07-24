
package L33_last_lesson_with_46_examples;

public class Test12 {
    void abc(){
        try{
            def();
            return;
        }
        finally{
            System.out.println("Finally");
        }
    }
    void def(){
        System.out.println("def");
        throw new StackOverflowError();
    }
    public static void main(String[] args) {
        Test12 t = new Test12();
        t.abc();
    }
}

//Output:
//    StackOverflowError