package sortingSe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;


public class frequency {
    
    public List<List<String>> groupAnagrams(String[] str){

         Map<String, List<String>> map = new HashMap<>();
        for (String s : str) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String stored = new String(charArray);

            map.putIfAbsent(stored, new ArrayList<>());
            map.get(stored).add(s);
        }
        return new ArrayList<>(map.values());

        /*Map<String, List<String>> map = new HashMap<>();
        for (String s : str) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String stored = new String(charArray);
            if(!map.containsKey(stored)){
                map.put(stored, new ArrayList<>());
            }
            map.get(stored).add(s);
        }
        return new ArrayList<>(map.values());*/

       /*Map<String, List<String>> map = new HashMap<>();
        for (String s : str) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String stored = new String(charArray);
            map.computeIfAbsent(stored, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());*/
        
        
        
    }
    public static void main(String[] args) {
        frequency solution = new frequency();
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = solution.groupAnagrams(str);
        System.out.println(result);
    }
}
