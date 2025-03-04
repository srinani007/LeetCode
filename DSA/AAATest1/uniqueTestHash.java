package AAATest1;

import java.util.LinkedHashMap;
import java.util.Map;

public class uniqueTestHash {
    public static void main(String[] args) {
        String str = "aabb";
        char result = findFirstUnique(str);
        System.out.println(result);

    }
    public static char findFirstUnique(String s){
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        
        //Count the frequency of each character
        for(char c : s.toCharArray()) {
            map.put(c,  map.getOrDefault(c, 0) + 1);
        }

        //Find first character with count 1
        for( Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1) {
                return entry.getKey(); 
            }
        }
        return '\0'; // return null character if no unique char found
    }
}
