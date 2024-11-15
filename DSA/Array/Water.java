package Array;

public class Water {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
    public static int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right){
            int width = right - left;
            max = Math.max(max, Math.min(height[left], height[right]) * width);
            if(height[left] <= height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}
