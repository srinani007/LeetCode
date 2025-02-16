package Array;

public class ProductArray {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = nums[i - 1] * answer[i - 1];
        }
        int R = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * R;
            R *= nums[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        ProductArray pa = new ProductArray();
        int[] nums = {1, 2, 3, 4};
        int[] result = pa.productExceptSelf(nums);
        for (int i : result) {
            System.out.println(i);
        }
        
    }
}
