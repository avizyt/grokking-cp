package coding.fundamental;

import java.util.HashMap;
import java.util.Map;

public class Mapping {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "mango");
        map.put(2, "apple");
        map.put(3, "banana");
        map.put(4, "grapes");

        System.out.println("Iterating Hasmap..");
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());

        }
    }

}
