package SwitchCase;

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[nums[i] % n] += n;
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] < n) {
                return i;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 2, 3, 4, 6};
        int result = s.missingNumber(nums);
        System.out.println(result);
    }
}