
package L33_last_lesson_with_46_examples;

public class Test6 {
    
    int x = 10;
    int a = 5;
    int b = 10;
    int c = 4;
    
    public double sredArifm(){
        if(x > 0){
            double avg = 0;
            avg = (a + b + c)/3;
            return avg;
        }
        else{
            // не объявлена переменная avg
            double avg;
            avg = 0;
            return avg;
        }
    }
}
