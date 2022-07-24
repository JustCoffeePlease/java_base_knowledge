
package L20_Varargs_ForEach;

public class Test5 {
    public static void main(String[] args){
        String[] students = {"Vasilev", "Kharlamova", "Rozhin", "Borodina"};
        String[] exams = {"Java", "Math", "Philosophy"};
        
        for(String s1: students){
            for(String s2: exams){
                System.out.println(s1 + "---" + s2);
            }
        }
    }
}
