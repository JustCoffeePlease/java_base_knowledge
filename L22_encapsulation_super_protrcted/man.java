package L22_encapsulation_super_protrcted;
// –абота с private переменными с помощью public методов
public class man {

    final String sex;

    public man(String sex) {
        this.sex = sex;
    }
    
    private boolean clever;
    // Using encapsulation for clever
    public boolean isClever() {
        return clever;
    }

    public boolean setClever(String s) {
        if (s == "Yes") {
            clever = true;
        }
        if (s == "No") {
            clever = false;
        }
        return clever;
    }
    private String name;

    // Using encapsulation for name
    public String getName() {
        return name;
    }

    public void setName(String s) {
        name = s;
    }
    // Using encapsulation for age           
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int i) {
        if (i > 0) {
            age = i;
        }
    }
    // Using encapsulation for weight
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int i) {
        if (i > 0) {
            weight = i;
        }
    }
}

class manTest {

    public static void main(String[] args) {
        man s = new man("Male");
        // ƒанное определение недоступно, так как переменные private видны только в том классе, где они инициализированы
//        s.name = "Alex";
//        s.age = 26;
//        s.weight = 81;
        s.setName("Alex");
        s.setAge(26);
        s.setWeight(81);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getWeight());
    }
}
