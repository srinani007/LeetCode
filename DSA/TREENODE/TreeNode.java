package TREENODE;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution1 {
    int maxx = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return maxx;
    }
    public int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        maxx = Math.max(maxx,left+right);
        return Math.max(left,right)+1;
    }   
}