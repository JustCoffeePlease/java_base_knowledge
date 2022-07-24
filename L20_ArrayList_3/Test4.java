
package L20_ArrayList_3;

import java.util.HashMap;
import java.util.Map;

public class Test4 {
    public static void main(String[] args){
        // Как Dictionary в Python
        Map<Integer, String> map = new HashMap<>();
        map.put(777, "Ivanov Ivan");
        map.put(778, "Kharlamova Olesya");
        map.put(779, "Vasilev Aleksey");
        map.put(780, "Yadykov Anton");
        map.put(781, "Rozhin Evgeny");
        
        map.remove(780);
        System.out.println("map = " + map);
    }
}
