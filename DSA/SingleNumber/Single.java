package SingleNumber;

class Solution3 {
    public int singleNumber(int[] nums) {
        int result = 0;
        for( int num : nums){
            result ^= num;
        }
        return result;
    }
}
