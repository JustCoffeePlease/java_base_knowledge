
package L6_overloading_This;

public class Test1 {
    int sum(int a, int b, int c){
        return a + b + c;
    }
    
    int Averrage_(int a, int b, int c){
        return sum(a, b, c) / 3; 
    }
}
