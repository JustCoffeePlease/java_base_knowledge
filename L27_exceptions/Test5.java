
package L27_exceptions;

public class Test5 {
    static void abc(){
        System.out.println("Method abc is working");
        abc();
    }
    public static void main(String[] args){
        try{abc();}
        catch(StackOverflowError e){
            System.out.println("Не стоит обрабатывать Error");
        }

    }
}
