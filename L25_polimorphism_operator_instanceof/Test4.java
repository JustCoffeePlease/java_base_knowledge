
package L25_polimorphism_operator_instanceof;

public class Test4 {
    public static void main(String[] args){
        String [] array1 = {"Hello", "Goodbue"};
        Object [] array2 = array1;
        String [] array3 = (String[])array2;
//        array3[0] = new StringBuilder("Ok");
//        array2[0] = new StringBuilder("Ok");
    }
}
