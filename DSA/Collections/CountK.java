package Collections;

import java.util.HashMap;
import java.util.Map;

public class CountK {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,2,2,3};
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(map);
    }
}
