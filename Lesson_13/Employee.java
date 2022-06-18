
package Lesson_13;

public class Employee {
    
    public static void main(String[] args){
//        switch ("15"){
//            case "Monday": 
//                System.out.println("Work until 6pm");
//                break;
//            case "Tuesday": 
//                System.out.println("Work until 6pm");
//                break;
//            case "Wednesday": 
//                System.out.println("Work until 6pm");
//                break;
//            case "Thursday": 
//                System.out.println("Work until 6pm");
//                break;
//            case "Friday": 
//                System.out.println("Work until 6pm");
//                break;
//            case "Saturday": 
//                System.out.println("Work until 2pm");
//                break;
//            case "Sunday": 
//                System.out.println("Without work");
//                break;
//            default:
//                System.out.println("Do not have this day");
//        }
//       Œ–Œ“ »… ¬¿–»¿Õ“ «¿œ»—»
        switch ("Wednesday"){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Work until 6pm");
                break;
            case "Saturday": 
                System.out.println("Work until 2pm");
                break;
            case "Sunday": 
                System.out.println("Without work");
                break;
            default:
                System.out.println("Do not have this day");            
        }
    }
}
