package assignments.strings;

import java.util.Arrays;
import java.util.HashMap;

public class Strings {
    public static String reverseSentence(String input) {

        // using string builder, we can iterate through the input's characters
        // and constantly insert said characters into pos 0
        // effectively reversing our string

        String[] words = input.split(" ");

        StringBuilder b = new StringBuilder();
        for (String s : words) {
            b.insert(0," ");
            b.insert(0, s);
        }

        return b.toString();
    }

    /*
    // This method exists because I feel like using sorted strings is a bit of a cheat
    public static boolean hasSameCharset(String a, String b) {

        // we could use hash sets, but since hash sets cannot record the total number of a single instance of
        // characters, we cannot use them accurately
        HashMap<Character, Integer> aSet = new HashMap<Character, Integer>();
        HashMap<Character, Integer> bSet = new HashMap<Character, Integer>();

        // create a hashmap with all the characters and count of characters for string a
        for (char c : a.toCharArray()) {
            if (!aSet.containsKey(c))
                aSet.put(c, 0);

            aSet.put(c, aSet.get(c) + 1);
        }

        // create a hashmap with all the characters and count of characters for string b
        for (char c : b.toCharArray()) {
            if (!bSet.containsKey(c))
                bSet.put(c, 0);

            bSet.put(c, bSet.get(c) + 1);
        }

        // ensure all the data in from string a matches string b
        for (char key : aSet.keySet()) {
            if (!bSet.containsKey(key) || !bSet.get(key).equals(aSet.get(key))) {
                return false;
            }
        }

        // finally, do the same as above, but using string b
        for (char key : bSet.keySet()) {
            if (!aSet.containsKey(key) || !bSet.get(key).equals(aSet.get(key))) {
                return false;
            }
        }

        return true;
    }
     */

    public static boolean hasSameCharset(String a, String b) {
        // used to convert strings into char arrays, so we can use Arrays.sort on them
        char[] temp;

        // sort string a
        temp = a.toCharArray();
        Arrays.sort(temp);
        a = new String(temp);

        // sort string b
        temp = b.toCharArray();
        Arrays.sort(temp);
        b = new String(temp);

        // by checking to see if the sorted strings of a and b are equal,
        // we can tell if they have the same characters and length
        return a.equals(b);
    }

    public static void main(String[] args) {
        System.out.println("Assignment: Strings - Johannes\n\n");

        System.out.println("Reversing 'This is an assignment':");
        System.out.println(reverseSentence("This is an assignment"));

        System.out.println("\n\nChecking to see if 'elbow' and 'below' contain the same characters");
        if (hasSameCharset("below", "elbow")) {
            System.out.println("below and elbow contain the same characters");
        }
        else {
            System.out.println("below and elbow do not contain the same characters");
        }
    }
}
