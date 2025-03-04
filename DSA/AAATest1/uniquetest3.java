package AAATest1;

import java.util.HashMap;

public class uniquetest3 {
    public static void main(String[] args) {
        String iString = "aabbas";
        char result = uniquetesthas3(iString);
        System.out.println("unique test 3 : " + result);
    }
    public static char uniquetesthas3(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);
        for (char c : s.toCharArray())
            if (map.get(c) == 1)
                return c;
        return ' ';
    }
}
