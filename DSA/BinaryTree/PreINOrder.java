package BinaryTree;

import java.util.HashMap;
import java.util.Map;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class PreINOrder {
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inOrderIndexMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inOrderIndexMap.put(inorder[i], i);
        }
        return splitTree(preorder, inOrderIndexMap, 0, 0, inorder.length - 1);
    }

    private static TreeNode splitTree(int[] preorder, Map<Integer, Integer> inOrderIndexMap, int rootIndex, int left, int right) {
        if (left > right) {
            return null; // Base case: no elements to construct the tree
        }

        TreeNode root = new TreeNode(preorder[rootIndex]);
        int mid = inOrderIndexMap.get(preorder[rootIndex]);

        // Recursively build the left subtree
        root.left = splitTree(preorder, inOrderIndexMap, rootIndex + 1, left, mid - 1);
        
        // Recursively build the right subtree
        root.right = splitTree(preorder, inOrderIndexMap, rootIndex + mid - left + 1, mid + 1, right);
        
        return root;
    }

    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode root = buildTree(preorder, inorder);
        System.out.println(root.val); // 3
        System.out.println(root.left.val); // 9
        System.out.println(root.right.val); // 20
        System.out.println(root.right.left.val); // 15
        System.out.println(root.right.right.val); // 7
    }
}