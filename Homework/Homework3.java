
package Homework;

public class Homework3 {
    public static void main(String[] args) {
    
        // task 1 ___________________________________________________________
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20l;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l; // 
        
            // +- как и в Python
            // *  как и в Python
            // /  получение целой части (Без округления)
            // %  нахождение остатка
            // ++ и -- это прибавление единицы к числу
        
        
            System.out.println(result);
            
        // task 2___________________________________________________________
        
        int a = 5;
        int b = 8;
        
        int expression_1 = a-- - --a + ++a + a++ + a; // 5 - 3 + 4 + 4 + 5 
        int expression_2 = ++b - b++ + ++b - --b; // 9 - 9 + 11 - 10
    
            System.out.println(expression_1);
            System.out.println(expression_2);
    
        // ++(--) слева от переменной (числа) это увеличение на один сразу
        //                                        уменьшение
        // ++(--) слева от переменной (числа) это увеличение на один в следующем
        //                                        уменьшение           выражении     
    
    
    }
}
