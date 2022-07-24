package L21_garbage_collection;

public class Test3 {

    // Constructor
    Test3() {
        System.out.println("The object is created");
    }
    // Method
    void Test3() {
        System.out.println("The object is created");
    }
}

class A {

    public static void main(String[] args) {
        Test3 t = new Test3();
    }
}
