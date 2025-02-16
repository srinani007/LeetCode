package BinaryTree;

class TreeNode {
    char value;
    TreeNode left;
    TreeNode right;

    TreeNode(char value) {
        this.value = value;
        left = null;
        right = null;
    }
}
public class ImpleOrder {
    public void PreOrder(TreeNode node) {
        if(node == null) {
            return;
        }
        System.out.println(node.value + " ");
        PreOrder(node.left);
        PreOrder(node.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode('A');
        root.left =  new TreeNode('B');
        root.right = new TreeNode('C'); 
        root.left.left = new TreeNode('D'); 
        root.left.right = new TreeNode('E');   
        root.right.left = new TreeNode('F');

        ImpleOrder impleOrder = new ImpleOrder();
        System.out.println("PreOrder Traversal ");
        impleOrder.PreOrder(root);
    }
    
}
