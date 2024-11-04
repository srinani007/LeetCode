package sortingSe;

import java.util.Arrays;

public class selection {
    public static void selectingSort(int[] arr){
        for( int i = 0; i < arr.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectingSort(arr);
        System.out.println("Sorted array:"+ Arrays.toString(arr));
    }
}
