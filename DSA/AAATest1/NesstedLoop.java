package AAATest1;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;


public class NesstedLoop {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 13;
        int[] result = twoSums(nums, target);
        System.out.println("Indices of the two numbers that add up to " + target + " are: " + result[0] + " and " + result[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        return IntStream.range(0, nums.length)
        .filter(i -> map.containsKey(target - nums[i]) || map.put(nums[i], i) != null)
        .mapToObj(i -> new int[] {map.get(target - nums[i]),i})
        .findFirst()
        .orElseThrow(() -> new IllegalArgumentException("No two sum s . olution"));
    }
    public static int[] twoSums(int[] nums, int target){
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] {numMap.get(complement), i};  
            }
            numMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
