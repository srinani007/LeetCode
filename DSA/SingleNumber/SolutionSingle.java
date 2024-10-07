package SingleNumber;

import java.util.Arrays;

class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];
        Arrays.sort(nums);
        int res = 0;
        for(int i = 0; i < nums.length; i+=2){
            System.out.println(nums[i]);
            if(i==nums.length-1) {
                res = nums[i];
            } else if(nums[i]!=nums[i+1]){
                res = nums[i];
                break;
            }
        }
        return res;
    }
}
