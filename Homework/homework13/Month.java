
package Homework.homework13;

public class Month {
    
    public int months_number;
    
    Month(int months_number){
        this.months_number = months_number;
        
        switch(months_number){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("The last day of this moths is 31th");
            break;
            case 2:
                System.out.println("The last day of this moths is 28th");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("The last day of this moths is 30th");
                break;
            default:
                System.out.println("There is not this months number");
        }
    }
    
    public static void main(String[] args){
        Month mon = new Month(3);
    }
}
