package permutation;

import java.util.ArrayList;
public class bfs {
    public ArrayList<ArrayList<Integer>> permute(int[] nums) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        helper(result, list, nums);
        return result;
    }
    public void helper(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list, int[] nums) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<Integer>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                continue;
            }
            list.add(nums[i]);
            helper(result, list, nums);
            list.remove(list.size() - 1);
        }
    } 

    public static void main(String[] args) {
        bfs bfs = new bfs();
        int[] nums = {1, 2, 3};
        ArrayList<ArrayList<Integer>> result = bfs.permute(nums);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
