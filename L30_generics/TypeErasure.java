
package L30_generics;

import java.util.ArrayList;

public class TypeErasure {
    public static void main(String[] args) {
        Info <String> info_1 = new Info <> ("Hello");
        System.out.println(info_1);
        String s = info_1.getValue();
        
        Info <Integer> info_2 = new Info <> (100);
        System.out.println(info_2);
        Integer i = info_2.getValue();
    }
    
//    public void abc(Info <String> info){
//        String s = info_1.getValue();
//    }
//    public void abc(Info <Integer> info){
//        Integer i = info.getValue();
//    }    
}

class Info <T>{
    private T value;
    
    public Info(T value){
        this.value = value;
    }
    public String toString(){
        return "[{" + value + "]}";
    }
    public T getValue(){
        return value;
    }
}

class Parent{
    public void abc(Info <String> info){
        String s = info.getValue();
    }    
}

//class Child extends Parent{
//    public void abc(Info<Integer> info){
//        Integer i = info.getValue();
//    }
//}