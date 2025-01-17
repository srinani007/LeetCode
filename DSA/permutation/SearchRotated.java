package permutation;

import java.util.HashMap;

public class SearchRotated {
    /* public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    } */
    public int search(int[] nums, int target) {
    int n = nums.length;

    HashMap<Integer, Integer> map = new HashMap<>();

    for(int i = 0; i < n; i++) {
        map.put(nums[i], i);
    }
    return map.getOrDefault(target, -1);
}

    public static void main(String[] args) {
        SearchRotated s = new SearchRotated();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(s.search(nums, 0));
        System.out.println(s.search(nums, 3));
        System.out.println(s.search(nums, 5));
        System.out.println(s.search(nums, 2));
    }
}