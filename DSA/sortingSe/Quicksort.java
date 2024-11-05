package sortingSe;

import java.util.Arrays;

public class Quicksort  {
    // initize three parameters, 
    public static void quickSort(int[] arr, int low, int high){
        //if low is lessthan high then only excute
        if (low < high) {
            //The partition method is called to rearrange the elements in the array.
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    private static int partition(int[] arr, int low, int high){
        //The pivot is chosen as the last element of the current sub-array (arr[high]).
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:"+ Arrays.toString(arr));
    }
}

