package AAATest1;

public class SumOfEven {
    public int[] sumEvenAfter(int[] nums, int[][] queries) {

        int sumeven = 0;

        for (int num : nums) {

            if (num % 2 == 0) {
                sumeven += num;
            } 
        }

        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int val = queries[i][0], index = queries[i][1];

            if (nums[index] % 2 == 0) sumeven -= nums[index]; 
            nums[index] += val;

            if (nums[index] % 2 == 0) sumeven += nums[index]; 
            result[i] = sumeven;

        }

        return result;
    }

    public static void main(String[] args) {
        SumOfEven sum = new SumOfEven();
        int[] nums = { 1, 2, 3, 4 , 5, 6};
        int[][] queries = { { 1, 0 }, { 1, 1 }, { 1, 2 }, { 1, 3 }, {1, 4}};
        int[] result = sum.sumEvenAfter(nums, queries);
        for (int num : result) {
            System.out.println(num);
        }
    }
}
