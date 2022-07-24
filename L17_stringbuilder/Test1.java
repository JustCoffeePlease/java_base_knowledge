
package L17_stringbuilder;
class Car{};

public class Test1 {
    public static void main(String[] args){
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good day");
        StringBuilder sb3 = new StringBuilder(50); // Указываем вместимость
        StringBuilder sb4 = new StringBuilder(sb2); // Ссылается не на sb2, а на объект, с таким же значением, как у sb2

        System.out.println(sb3.length()); // Возвращает длину объекта
        // В данном случае возвращает 0, так как указана только вместимость объекта, сам по себе он пуст
        System.out.println(sb2.charAt(3)); // Возвращает значение по указанному индексу

        System.out.println(sb2.indexOf(" ")); // Возвращает индекс указанного значения в объекте
        // Возвращает -1, если указанный символ не найден
        System.out.println(sb2.indexOf("o", 1)); // Возвращает индекс указанного значения в объекте, начиная с индекса 1

        String s = sb2.substring(5); // Возвращает символы объекта, начиная с указанного
        System.out.println(s);

        String s2 = sb2.substring(5, 8); // Возвращает символы объекта в указанных пределах
        System.out.println(s2);

        System.out.println(sb2.subSequence(5, 8)); // Как substring, только возвращает не String, а CharSequence

        sb2.append(22); // Изменяет объект. Добавляет к нему указанные значения
        System.out.println(sb2);

        sb2.append(new Car());
        System.out.println(sb2);

        System.out.println(sb2.insert(4, 55)); // Метод добавляет на позицию (первое число) значение (второе значение метода)

        System.out.println(sb2.insert(sb2.length(), "Hello")); // Делает тоже самое, что и append

        StringBuilder sb10 = new StringBuilder("Hello World");
//        sb10.delete(3, 6); // Удаляет значения в указанных пределах
//        System.out.println(sb10);
        sb10.deleteCharAt(6); // Удаляет символ, соответствующий указанному индексу
        System.out.println(sb10);

        sb10.reverse(); // Размещает символы объекта в обратном порядке
        System.out.println(sb10); // Метод подходит только для StringBuilder, не для String
        
        StringBuilder sb12 = new StringBuilder("Hey everybody");
        sb12.replace(0, 3, "Hello"); // Заменяет символы на указанном промежутке на указанное значение
        System.out.println(sb12);
        
        System.out.println(sb12.capacity()); // Возвращает текущую вместимость объекта
    }
}
