package twoPointer;

public class windowslider {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Maximum sum of subarray of size " + k + ": " + maxSum(arr, k)); // Output: 9
    }

   public static int maxSum(int[] arr, int k){
    int n = arr.length;
    if(n < k) return -1;
    int max = 0;
    int windowSum = 0;

    for(int i = 0; i < k; i++){
        windowSum += arr[i];
    }
    max = windowSum;
    for(int i = k; i < n; i++){
        windowSum += arr[i] - arr[i - k];
        max = Math.max(max, windowSum);
    }
    return max;
   } 
}
