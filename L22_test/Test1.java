package L22_test;

import L22_encapsulation_super_protrcted.man;

public class Test1 {

    public static void main(String[] args) {
        // Чтобы создать объект импортируемого класса, конструктор должен быть public
        man s = new man("Male");

        s.setName("Alex");
        s.setAge(26);
        s.setWeight(81);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getWeight());
    }

}
