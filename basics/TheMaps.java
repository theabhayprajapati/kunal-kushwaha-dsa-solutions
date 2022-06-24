package basics;

import java.util.HashMap;
import java.util.Map;

/**
 * TheMaps
 */
public class TheMaps {

    public static void main(String[] args) {
        // Create a map of strings, with string keys, and print it out
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "apple");
        map.put("b", "banana");
        map.put("c", "coconut");
        System.out.println(map);
        map.put("a", "alphabets");
        System.out.println(map);
        // print all keys
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        // print all values
        for (String value : map.values()) {
            System.out.println(value);
        }

    }
}