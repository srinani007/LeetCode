package Co;

import java.util.HashMap;
import java.util.Map;

public class HashMAPFunc {
    public static void main(String[] args) {
        HashMAPFunc h = new HashMAPFunc();
        System.out.println(h.wordCount("Prasant is so cool am am"));
    
        
    }
    public Map<String, Integer> wordCount(String strings) {
        Map<String, Integer> map = new HashMap<>();
        String[] words = strings.split("\\s+");
        for (String s : words) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        return map;

    }
    
}
