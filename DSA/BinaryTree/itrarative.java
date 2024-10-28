package BinaryTree;

import java.util.Stack;


public class itrarative {
    public void PreOrder(TreeNode root){
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            System.out.println(node.value + " ");
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode('A');
        root.left = new TreeNode('B');
        root.right = new TreeNode('C');
        root.left.left = new TreeNode('D');
        root.left.right = new TreeNode('E');
        root.right.left = new TreeNode('F');
        root.right.right = new TreeNode('G');

        itrarative i = new itrarative();
        System.out.println("Preorder Traversal (Iterative): ");
        i.PreOrder(root);
        
    }
}
