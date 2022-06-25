
package L12_if_if_else;

public class Test10 {
    
    public static void main(String[] args){
    
        int salary = 200_000;
        boolean b = true;
        
        if (salary < 150_000 && b == false || !true)
            System.out.println("Too smal salary");        
        else if (salary < 200_000){
            System.out.println("Middle salary");
        }
        else if(salary < 300_000){
            System.out.println("huge salary");
        }
        else if (b == true){
            System.out.println("WoW");
        }
        
        int a = 10;
        int c = 10;
        
        int maximum = (a > c)?a:c;
            System.out.println(maximum);
    }
}
