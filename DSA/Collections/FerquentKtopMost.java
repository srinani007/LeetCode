package Collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FerquentKtopMost {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> fMap = new HashMap<>();
        for(int num : nums){
            fMap.put(num, fMap.getOrDefault(num, 0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = 
        new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        for(Map.Entry<Integer, Integer> entry : fMap.entrySet()){
            minHeap.add(entry);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = minHeap.poll().getKey();
        }

    
        return result;

    }
    

    public static void main(String[] args) {
        FerquentKtopMost s = new FerquentKtopMost();
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(Arrays.toString(s.topKFrequent(nums, k))); // output
    }
}
