
package L10_import_import_static;

import static L9_scopes_of_variables.MyCar.a;

public class AAA {
    
    static int a = 5;
    
    public static void main(String[] args){
    
        System.out.println(a);
        // Сначала проверяется наличие переменной внутри класса,
        // потом из импортируемого класса
        
    }
    
}
