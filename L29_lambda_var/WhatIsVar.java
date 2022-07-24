
package L29_lambda_var;

import java.util.ArrayList;

public class WhatIsVar {
//    var v = 10; cannot write var here
    public static void main(String[] args) {
        TestInferenceType tit = new TestInferenceType();
        // аналогичная запись
        var tit1 = new TestInferenceType();
        var i = 10; // int
        var w = 1.5f; //float
        var array = new String[]{"a", "b"};
        var result = abc();
        Object obj = "Hello";
        var obj2 = obj;
        ArrayList <String> a1 = new ArrayList<>();
        for (var s: a1){System.out.println(s);}
        var array2 = new int[] {1, 2};  
    }
    static double abc(){return 3.14;}
}

class TestInferenceType{}

interface I{
    void abc();
    
    default void def(){}
    default void def2(){}
    default void def3(){}
}