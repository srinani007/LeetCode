package TREENODE;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
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
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(s.diameterOfBinaryTree(root));
        
    }
}