package BinaryTree;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public String value;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class KsMAll {
    private int count = 0;
    private int result = 0;
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root, k);
        return result;
    }
    private void inOrder(TreeNode node, int k){
        if(node == null) return;
        inOrder(node.left, k);
        count++;
        if (count == k) {
            result = node.val;
            return;   
        }
        inOrder(node.right, k);

    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        KsMAll solution = new KsMAll();
        System.out.println(solution.kthSmallest(root, 1));
        System.out.println(solution.kthSmallest(root, 2));
    }
}
