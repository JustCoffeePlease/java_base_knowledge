
package L2_primitive_data_types;

public class PrimitiveDataTypes {
    public static void main(String [] args){
        
        byte b1 = 10; // ТипДанных.ИмяПеременной = ЗначениеПеременнойж
        byte b2 = 20;
        byte b3 = 100;
        
        short s1 = 5;
        short s2 = -10;
        short s3 = 0;
        
        int i1 = 500; // int является типом данных по умолчанию в java
        
        long l1 = 1000;
        long l2 = 10000000000L;
        long l3 = 51L;
        
        // Чем шире диапазон типа даннных, тем больше он использует места
        // в памяти
        
        float f1 = 3.14F;
        float f2 = 2.5f;
//        float f3 = 20;
        float f3 = 20.0f;
        
        double d1 = 5.5D;
        double d2 = 87.65;
        
        
        char c1 = 'a';
        char c2 = 'A';
        char c3 = '7';
//        char c4 = 'ab'; Возвращается ошибка, так как должен быть один символ
        char c4 = ' ';
        
        char c5 = 300; // Этот тип записи означает, что c5 будет содержать
                       // значение трехсотого символа в unicode
        char c6 = '\u05AB'; // 16ая система счисления 
        
        boolean bool1 = true;
        boolean bool2 = false;
        
        int a1 = 60;
        int a2 = 0B111100;
        int a3 = 0b111100;
        int a4 = 074;
        int a5 = 0x3C;
        int a6 = 0X3c;
        
        // Символ _ (underscore)
        
        int a7 = 1_000_000; // Для лучшей читабельности
        
        
//        System.out.println(b1);
//        System.out.println(s2);
//        System.out.println(l2);
//        System.out.println(f1);
//        System.out.println(d2);
//        System.out.println(c2);
//        System.out.println(c5);
//        System.out.println(c6);
//        System.out.println(bool1);
        
        System.out.println(a1);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a6);






        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
