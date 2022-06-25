
package L6_overloading_This;

public class MethodOverloading {
    // Overloading(ѕерегрузка) - создание методов с одинаковым названием,
    // но разными параметрами
    void ShowInt(int int1){
        System.out.println(int1);
    }
    
    void ShowBoolean(boolean b1){
        System.out.println(b1);
    }
    
    void ShowString(String s1){
        System.out.println(s1);
    }
    
    // ¬оспользуемс€ методом Overloading и зададим три аналогичные функции 
    // с одним названием, чтобы в них не запустатьс€
    // »мена » параметры полностью одинаковыми быть не могут
    void Show(int int1){
        System.out.println(int1);
    }
    
    void Show(boolean b1){
        System.out.println(b1);
    }
    
    void Show(String s1){
        System.out.println(s1);
    }    
    
    void Show(String s, int a){
        System.out.println("String: " + s + " int: " + a);
    }
    
    void Show(int a, String s){
        System.out.println("What a wonderful day");
    }    
}


class MethodOverloadingTest{
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        // ShowInt Output:
        int a = 500;
        mO.ShowInt(a);
        // ShowBoolean Output:
        boolean b = true;
        mO.ShowBoolean(b);
        // ShowString Output:
        String s = "Hello";
        mO.ShowString(s);
        // Using OverLoading Show output:
        mO.Show(a);
        mO.Show(b);
        mO.Show(s);
        mO.Show(s, a);
        mO.Show(a, s);

    }
}