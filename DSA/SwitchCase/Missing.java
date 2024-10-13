package SwitchCase;

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int[] v = new int[n+1];
        for(int i = 0; i < n; i++){
            v[nums[i]] = 1;
        }
        for(int i = 0; i < n+1; i++){
            if(v[i] == 0){
                return i;
            }
        }
        return 0;

        

        
    }
}
