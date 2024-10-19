package Binarya;

import Binary.TreeNode;

public class IsValdiation {
    public boolean isValidBST(TreeNode root) {
        return Valdiation(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private boolean Valdiation(TreeNode root, Long high, long low){
        if(root == null) return true;
        if(root.val <= low || root.val >= high) return false;
        return Valdiation(root.left, low, root.val) && Valdiation(root.right, high, root.val);
    }
}
