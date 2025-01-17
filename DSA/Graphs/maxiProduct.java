package Graphs;

public class maxiProduct {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int result = nums[0];

        for(int i = 1; i < nums.length; i++){
            int temp = Math.max(nums[i], Math.max(max * nums[i], min * nums[i]));
            min = Math.min(nums[i], Math.min(max * nums[i], min * nums[i]));
            max = temp;
            result = Math.max(result, max);
        }
        return result;
    }
    public static void main(String[] args) {
        maxiProduct mp = new maxiProduct(); 
        int[] nums = {2,3,-2,4};
        System.out.println(mp.maxProduct(nums));
    }
}
