package Merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_intervals {
    public int[][] merge(int[][] intervals) {
        // Step 1: length of intervals is less than 1 return intervals
        if( intervals.length <= 1){
            return intervals;
        }
        // Step 1: Sort intervals by the start time
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        // Step 2: Prepare the List to collect merged intervals
        List<int[]> merged = new ArrayList<>();
        //Step 3: Start Merging Intervals
        for (int[] interval : intervals){
            // Step 4: If the merged list is empty or the current interval does not overlap with the last interval in the merged list add interval
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]){
                merged.add(interval);
            }
            // Step 5: if the current interval overlaps with the last interval in the merged list, merge them
            else{
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }
        // Step 6: Convert the merged list List<>[] to int[][] array
        return merged.toArray(new int[merged.size()][]);
    }
    public static void main(String[] args) {
        Merge_intervals merge_intervals = new Merge_intervals();
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] results = merge_intervals.merge(intervals);
        for (int[] result : results ) {
            System.out.println(Arrays.toString(result));
        }
    }
}
