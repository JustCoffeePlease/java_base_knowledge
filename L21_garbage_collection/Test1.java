package L21_garbage_collection;

public class Test1 {

    public static void main(String[] args) {
        int s = 4;
        System.out.println((s < 4 ? "Yes" : "No"));

        int a = 5;
        int b = 6;
        int c = (a < 60) ? a++ : b++;
        System.out.println("a= " + a);
        System.out.println("b= " + b);

    }
}
