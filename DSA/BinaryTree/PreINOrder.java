package BinaryTree;

import java.util.HashMap;
import java.util.Map;



public class PreINOrder {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inOrderIndexMap = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
            inOrderIndexMap.put(inorder[i], i);
        }
        return splitTree(preorder, inOrderIndexMap, 0, 0, inorder.length - 1); 
    }
    private TreeNode splitTree(int[] preorder, Map<Integer, Integer> inOrderIndexMap, 
                           int rootIndex, int left, int right) {
            // Base case: if there are no elements to construct the tree
            if (left > right) {
                return null;
            }

        TreeNode root = new TreeNode(preorder[rootIndex]);
        int mid = inOrderIndexMap.get(preorder[rootIndex]);

        // Recursively build the left subtree
        root.left = splitTree(preorder, inOrderIndexMap, rootIndex + 1, left, mid - 1);
        
        // Recursively build the right subtree
        root.right = splitTree(preorder, inOrderIndexMap, rootIndex + (mid - left) + 1, mid + 1, right);
        
        return root;
    }
    public static void main(String[] args) {
        PreINOrder solution = new PreINOrder();
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode root = solution.buildTree(preorder, inorder);
        System.out.println(root);
        
    }
}