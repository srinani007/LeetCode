package Dictionary;

import java.util.HashSet;

class Duplicates {
    public boolean containsDuplicate(int[] nums) {
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] == nums[j]) {
        //             return true; // Found a duplicate
        //         }
        //     }
        // }
        // return false; // No duplicates found
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        Duplicates d = new Duplicates();
        int[] nums = {1, 2, 3, 1};
        System.out.println(d.containsDuplicate(nums)); // Output: true
    }
}