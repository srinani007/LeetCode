package Collections;

import java.util.*;

/**
 * This class provides a method to find the top k frequent elements in an array.
 */
public class FrequentK {

    /**
     * Returns the top k frequent elements in the given array.
     *
     * @param nums the input array
     * @param k    the number of top frequent elements to return
     * @return an array of the top k frequent elements
     */
    public int[] topKFrequent(int[] nums, int k) {
        // Create a frequency map
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Create a priority queue to store the top k frequent elements
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(
            (a, b) -> b.getValue().compareTo(a.getValue()));

        // Add all entries from the frequency map to the priority queue
        queue.addAll(frequencyMap.entrySet());

        // Extract the top k frequent elements from the priority queue
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = queue.poll().getKey();
        }

        return result;
    }

    public static void main(String[] args) {
        FrequentK frequentK = new FrequentK();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] result = frequentK.topKFrequent(nums, k);
        System.out.println("Top " + k + " frequent elements: " + Arrays.toString(result));
    }
}