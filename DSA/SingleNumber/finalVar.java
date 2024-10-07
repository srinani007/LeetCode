package SingleNumber;

import java.util.HashSet;

class Solution {
    public int singleNumber(int[] nums) {
        final var set = new HashSet<Integer>(); // Create a HashSet to store unique numbers
        for (final var num : nums) {
            // If the number cannot be added (i.e., it's already in the set), remove it
            if (!set.add(num)) {
                set.remove(num); // Remove the number because it is a duplicate
            }
        }
        // After the loop, the set contains only the single number
        return (int) set.toArray()[0]; // Convert the set to an array and return the first element
    }
}

