package Serialization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeIntervals {
   public int[][] merge(int[][] interval){
    Arrays.sort(interval, (a, b) -> a[0] - b[0]);
    List<int[]> res = new ArrayList<>();

    for(int[] in : interval){
        if (res.isEmpty() || res.get(res.size()-1)[1] < in[0]){
            res.add(in);
        } else {
            res.get(res.size()-1)[1] = Math.max(res.get(res.size()-1)[1], in[1]);
        }
    }
    return res.toArray(new int[res.size()][]);
   }
    public static void main(String[] args) {
         mergeIntervals m = new mergeIntervals();
         int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
         int[][] res = m.merge(intervals);
         for(int[] r : res){
             System.out.println(Arrays.toString(r));
         }
    }
}
