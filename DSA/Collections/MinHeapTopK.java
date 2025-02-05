package Collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MinHeapTopK {
    public static void main(String[] args) {
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = 
        new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        Map<Integer,Integer> minMap = new HashMap<>();
        minMap.put(1, 3);
        minMap.put(2, 2);
        minMap.put(3, 1);

        int k = 2;
        for(Map.Entry<Integer, Integer> entry : minMap.entrySet()){
            minHeap.add(entry);
            if (minHeap.size() > k) {
                minHeap.poll();// remove the last frequency element.
            }
        }
        while (!minHeap.isEmpty()) {
           System.out.println(minHeap.poll().getKey()); 
        }
    }
}
