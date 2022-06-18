
package Lesson_10;

import Lesson_9.MyCar;
import Lesson_9.Student;
//ћожно написать общий импорт дл€ пакета import Lesson_9*;
import Lesson_8.*;

public class A {
    public static void main(String[] args){
    
        Lesson_9.MyCar c1 = new Lesson_9.MyCar("Red", "V8");
        MyCar c2 = new MyCar("Black", "V4");
        
        Lesson_8.Student st1 = new Lesson_8.Student("Albert", 2);
        
// ≈сли импортируемые пакеты имеют классы с одинаковыми названи€ми,
// то при использовании этих классов нужно использовать полные имена
    }
}
