
package L10_import_import_static;

import L9_scopes_of_variables.MyCar;
import L9_scopes_of_variables.Student;
//ћожно написать общий импорт дл€ пакета import Lesson_9*;

public class A {
    public static void main(String[] args){
    
        L9_scopes_of_variables.MyCar c1 = new L9_scopes_of_variables.MyCar("Red", "V8");
        MyCar c2 = new MyCar("Black", "V4");
        
        L8_final_static.Student st1 = new L8_final_static.Student("Albert", 2);
        
// ≈сли импортируемые пакеты имеют классы с одинаковыми названи€ми,
// то при использовании этих классов нужно использовать полные имена
    }
}
