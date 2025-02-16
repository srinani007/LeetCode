package BinaryTree;

import java.util.HashMap;
import java.util.Map;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

/**
 * This class constructs a binary tree from given preorder and inorder traversal arrays.
 */
public class PreINOrder {
    /**
     * Builds a binary tree from the given preorder and inorder traversal arrays.
     * 
     * @param preorder The preorder traversal array.
     * @param inorder  The inorder traversal array.
     * @return The root of the constructed binary tree.
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length == 0 || inorder.length == 0) {
            return null;
        }

        Map<Integer, Integer> inOrderIndexMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inOrderIndexMap.put(inorder[i], i);
        }
        return splitTree(preorder, inOrderIndexMap, 0, 0, inorder.length - 1);
    }

    /**
     * Recursively constructs the binary tree from the given preorder and inorder traversal arrays.
     * 
     * @param preorder       The preorder traversal array.
     * @param inOrderIndexMap A map containing the indices of elements in the inorder traversal array.
     * @param rootIndex      The current index in the preorder traversal array.
     * @param left           The left boundary of the current subtree in the inorder traversal array.
     * @param right          The right boundary of the current subtree in the inorder traversal array.
     * @return The root of the constructed binary tree.
     */
    private TreeNode splitTree(int[] preorder, Map<Integer, Integer> inOrderIndexMap, int rootIndex, int left, int right) {
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

    /**
     * Prints the binary tree in a readable format.
     * 
     * @param root The root of the binary tree.
     */
    private void printTree(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }

    public static void main(String[] args) {
        PreINOrder solution = new PreINOrder();
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode root = solution.buildTree(preorder, inorder);
        solution.printTree(root);
    }
}