package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class ZigzagLevelOrderTraversal {
    /**
     * Returns the zigzag level order traversal of a binary tree.
     * 
     * @param root the root of the binary tree
     * @return a list of lists, where each sublist contains the node values at a given level
     */
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean isEvenLevel = true;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> levelValues = new ArrayList<>(levelSize);

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                if (isEvenLevel) {
                    levelValues.add(node.val);
                } else {
                    levelValues.add(0, node.val); // Add to the beginning for odd levels
                }

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            result.add(levelValues);
            isEvenLevel = !isEvenLevel; // Toggle the level parity
        }

        return result;
    }
    public static void main(String[] args) {
        ZigzagLevelOrderTraversal solution = new ZigzagLevelOrderTraversal();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> result = solution.zigzagLevelOrder(root);
        System.out.println(result);
        
    }
}