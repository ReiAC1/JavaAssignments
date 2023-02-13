package assignments.collections;

import java.util.*;
import java.util.stream.Collectors;

public class Collections {

    static void mapDemo(Map<String, Integer> map) {

        System.out.println("Setting value 'X' to 1");
        map.put("X", 1);

        System.out.println("Setting value 'Y' to 2");
        map.put("Y", 2);

        System.out.println("X + Y = " + (map.get("X") + map.get("Y")));
        System.out.println("Expected value: 3");

        System.out.println("Removing X");
        map.remove("X");
        System.out.println("Does X exist:" + map.containsKey("X"));

        System.out.println("Adding assortment of keys");
        map.put("Test", 0);
        map.put("sEcond letter upper case", 0);
        map.put("ALL CAPS", 0);
        map.put("all lower", 0);
        map.put("EvErY oThEr LeTtEr UpPeR", 0);


        System.out.println("Forming a list of all keys with lowercase letters only");
        List<String> lowerKeys = map.keySet().stream().map(String::toLowerCase).collect(Collectors.toList());

        System.out.println("Printing out all keys in lower case");
        for (String k : lowerKeys) {
            System.out.println(k);
        }
    }

    public static void main(String[] args) {
        System.out.println("HashMap demo:");
        mapDemo(new HashMap<String, Integer>());

        System.out.println("\n\n");
        System.out.println("LinkedHashMapDemo");
        mapDemo(new LinkedHashMap<String, Integer>());
    }
}
