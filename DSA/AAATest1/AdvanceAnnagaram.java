package AAATest1;

import java.util.Map;
import java.util.HashMap;

public class AdvanceAnnagaram {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
            } else {
                return false;
            }
        }
        for (int value : map.values()) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("cbaebabacd", "bca"));
        System.out.println(isAnagram("abc", "bac"));
        System.out.println(isAnagram("abc", "abcd"));
        
    }

}
