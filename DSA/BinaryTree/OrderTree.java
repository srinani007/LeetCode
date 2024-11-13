package BinaryTree;
class Node{
    int data;
    Node left, right;
    public Node(int item){
        data = item;
        left = right = null;
    }
}
public class OrderTree {
   Node root;

   void PreOrder(Node node){
    if(node == null) return;
    System.out.print(node.data + " ");
    PreOrder(node.left);
    PreOrder(node.right);
   }
   void InOrder(Node node){
    if(node == null) return;
    InOrder(node.left);
    System.out.print(node.data + " ");
    InOrder(node.right);
   }
   void PostOrder(Node node){
    if(node == null) return;
    PostOrder(node.left);
    PostOrder(node.right);
    System.out.print(node.data + " ");
   }
}
class Main{
    public static void main(String[] args) {
        OrderTree tree = new OrderTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        System.out.println("PreOrder");
        tree.PreOrder(tree.root);
        System.out.println("\nInOrder");
        tree.InOrder(tree.root);
        System.out.println("\nPostOrder");
        tree.PostOrder(tree.root);
    }
}
