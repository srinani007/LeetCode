package permutation;

import java.util.List;
import java.util.ArrayList;

public class preMtation {
    public static void main(String[] args) {
        preMtation solution = new preMtation();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = solution.permute(nums);
        System.out.println(result);
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), result);
                return result;
    }
        
    private void backtrack(int[] nums, List<Integer> arrayList, List<List<Integer>> result) {
        if(arrayList.size() == nums.length){
            result.add(new ArrayList<>(arrayList));
            return;
        }
        for(int num : nums){
            if(arrayList.contains(num)) continue;
            arrayList.add(num);
            backtrack(nums, arrayList, result);
            arrayList.remove(arrayList.size() - 1);
        }    
        
    }

    // public void backtrack(int[] nums, List<Integer> tempList, List<List<Integer>> result) {
    //     if (tempList.size() == nums.length) {
    //         result.add(new ArrayList<>(tempList));
    //         return;
    //     }
    //     for (int num : nums) {
    //         if (tempList.contains(num)) continue;
    //         tempList.add(num);
    //         backtrack(nums, tempList, result);
    //         tempList.remove(tempList.size() - 1);
    //     }
    // }
}
