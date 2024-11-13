package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int x) {
        val = x;
    }
}

public class Zigzag1 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean even = true;

        while (!q.isEmpty()) { // Corrected condition here
            int n = q.size();
            LinkedList<Integer> list = new LinkedList<>();

            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll();
                if (even) {
                    list.addLast(node.val);
                } else {
                    list.addFirst(node.val);
                }
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            ans.add(list);
            even = !even;
        }
        return ans;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        Zigzag1 solution = new Zigzag1();
        List<List<Integer>> result = solution.zigzagLevelOrder(root);
        System.out.println(result);
    }
}

