package sortingSe;

import java.util.Arrays;

public class radix {
    public static void radixSort(int[] arr){
        int max = getMax(arr);
        for(int exp = 1; max / exp > 0; exp *= 10){
            coutingSort(arr, exp);
        }
    }
    private static void coutingSort(int[] arr, int exp){
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];
        for(int i = 0; i < n; i++){
            count[(arr[i] / exp) % 10]++;
        }
        for(int i = 1; i < 10; i++){
            count[i] += count[i - 1];
        }
        for(int i = n - 1; i >= 0; i--){
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
        System.arraycopy(output, 0, arr, 0, n);
    }
    private static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        radixSort(arr);
        System.out.println("Sorted array:"+ Arrays.toString(arr));
    }
}