package PQ;

import java.util.PriorityQueue;

public class KthNum {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int num : nums){
            q.add(num);
            if(q.size() > k) q.poll();
        }
        return q.poll();
    }
    public static void main(String[] args) {
        KthNum solution = new KthNum();
        int[] nums = {3, 5, 6, 7, 9, 1};
        int k = 5;
        System.out.println(solution.findKthLargest(nums, k));
    }
}
