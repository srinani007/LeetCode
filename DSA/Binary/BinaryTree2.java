package Binary;

public class BinaryTree2 {
    class Solution {
        public int maxDepth(TreeNode root) {
            if(root==null) return 0;
            return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
        }
    }
    public static void main(String[] args) {
        BinaryTree2 binaryTree2 = new BinaryTree2();
        Solution solution = binaryTree2.new Solution();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(solution.maxDepth(root));
    }
    
}
