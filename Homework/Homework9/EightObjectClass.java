
package Homework.Homework9;

public class EightObjectClass {
    
    public static int count;
    
    EightObjectClass(){
        
        count++;
        
        System.out.println("Object number " + count + " is created");
    }
    
}

class CreateObject{

    public static void main(String[] args){
    
        EightObjectClass FirstObject = new EightObjectClass();
        EightObjectClass SecondObject = new EightObjectClass();
        EightObjectClass ThirdObject = new EightObjectClass();
        EightObjectClass ForthObject = new EightObjectClass();
        EightObjectClass FifthObject = new EightObjectClass();
        EightObjectClass SixthObject = new EightObjectClass();
        EightObjectClass SeventhObject = new EightObjectClass();
        EightObjectClass EightObject = new EightObjectClass();
        
        FirstObject = null;
        System.out.println("FirstObject is removed " + EightObjectClass.count--);
        
        SecondObject = null;
        System.out.println("SecondObject is removed " + EightObjectClass.count--);
        
        ThirdObject = null;
        System.out.println("ThirdObject is removed " + EightObjectClass.count--);
        
        ForthObject = null;
        System.out.println("ForthObject is removed " + EightObjectClass.count--);
        
        FifthObject = null;
        System.out.println("FifthObject is removed " + EightObjectClass.count--);
        
        SixthObject = null;
        System.out.println("SixthObject is removed " + EightObjectClass.count--);
        
        
    }
}
