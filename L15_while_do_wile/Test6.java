
package L15_while_do_wile;

public class Test6 {
    public static void main(String[] args){
        
        int money = 100;
        // � ������� �� �������� whil�, 
        // ���� ������� ��� ������� ���� ��� ������� � ���� �����
        do{
            System.out.println("Place your bet");
            System.out.println("You lost");
            money = money - 10;
        }
        while (money > 50);
    }
}
