
package L17_stringbuilder;

public class Test2 {
    public static void main(String[] args){
        StringBuilder sb1 = new StringBuilder("Hello friend!");
        String s = null;
        
//        s = sb1.append(" How are you?").substring(sb1.indexOf('f'), sb1.indexOf('!'));
        // Возвращает ошибку, так как в методе indexOf невозможно передавать объекты char
        s = sb1.append(" How are you?").substring(sb1.indexOf("f"), sb1.indexOf("!"));
//        s = sb1.append(" How are you?").substring(6, 12);
//        s = sb1.append(" How are you?");
        
        System.out.println(s);
    }
}
