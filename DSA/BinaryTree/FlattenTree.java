package BinaryTree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public String value;
    TreeNode(int x) { val = x; }
}




public class FlattenTree {

    
    public void flatten(TreeNode root){
        if(root == null) return;
        TreeNode left = root.left;
        TreeNode right = root.right;

        // set the left child to null
        root.left = null;

        //Recursively flatten the left and right subtrees
        flatten(left);
        flatten(right);
        // connect right subtree
        root.right = left;

        // find the end of new right subtree
        TreeNode cur = root;
        while(cur.right != null) cur = cur.right;

        // connect the original right subtree
        cur.right = right;
    }

    // function to print flattened tree
    public void printFlattenedTree(TreeNode root){
        while(root != null){
            System.out.println(root.val + " -> ");
            root = root.right;
        }
        System.out.println("null");
    }
    
   public static void main(String[] args) {
    // Contructing the binary Tree
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(5);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.right.right = new TreeNode(6);
    // Flatten the binary tree
    FlattenTree solution = new FlattenTree();
    solution.flatten(root);
    // print the flatten tree
    solution.printFlattenedTree(root);

   }
}
