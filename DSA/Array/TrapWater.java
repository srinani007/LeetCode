package Array;

public class TrapWater {
    public  int trap(int[] height) {
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        
        leftMax[0] = height[0];
        rightMax[n - 1] = height[n - 1];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
            rightMax[n - i - 1] = Math.max(rightMax[n - 1], i);
        }
        int result = 0;
        for (int i = 0; i < n; i++){
            result += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        TrapWater trapWater = new TrapWater();
        System.out.println(trapWater.trap(height));

    }
}
