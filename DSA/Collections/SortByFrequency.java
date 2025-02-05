package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortByFrequency {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 3);
        map.put(2, 2);
        map.put(3, 1);
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());

        System.out.println(list);
    }
}
