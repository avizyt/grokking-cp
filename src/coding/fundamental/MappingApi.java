package coding.fundamental;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MappingApi {
    public static void main(String[] args) {
        Map<Character, Integer> mapvowel = new HashMap<>();
        Map<Character, Integer> mapcons = new HashMap<>();

        Set<Character> s = new HashSet<>();
        s.add('a');
        s.add('e');
        s.add('i');
        s.add('o');
        s.add('u');

        String line = "Maps are perfect to use for key-value mapping such as dictionaries. Some common scenarios are as follows";

        for (int i = 0; i < line.length(); i++) {
            Character ch = line.charAt(i);
            if (s.contains(ch) && Character.isLetter(ch)) {
                mapvowel.put(ch, mapvowel.getOrDefault(ch, 0) + 1);
            } else {
                mapcons.put(ch, mapcons.getOrDefault(ch, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> item : mapvowel.entrySet()) {
            System.out.println("Key " + item.getKey() + " Val: " + item.getValue());
        }

        for (Map.Entry<Character, Integer> item : mapcons.entrySet()) {
            System.out.println("Key " + item.getKey() + " Val: " + item.getValue());
        }

    }
}
