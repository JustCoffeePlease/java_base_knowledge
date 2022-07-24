
package L27_exceptions;

import java.io.*;

public class Test3 {
    public static void main(String[] args) throws Exception{
        File f = new File("ZaurTest.txt"); // абстрактная репрезентация пути к файлу или папке
        FileInputStream fis = new FileInputStream(f); // Создание потока, с помощью которого можно читать информацию из источника
        fis.read(); 
        FileOutputStream fos = new FileOutputStream(f); // Создание потока, с помощью которого можно писать информацию в источник
        fos.write(100);
     }  
}
