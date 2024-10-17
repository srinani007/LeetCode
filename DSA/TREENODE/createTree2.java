package TREENODE;

public class createTree2 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return createTree(nums, 0, nums.length -1);
    }

    private TreeNode createTree(int[] nums, int i, int j) {
       if (i > j) {
        return null;
       }
        int mid = (i + j) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = createTree(nums, i, mid - 1);
        root.right = createTree(nums, mid + 1, j);
        return root;
    }
    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};
        createTree2 tree = new createTree2();
        TreeNode root = tree.sortedArrayToBST(nums);
        System.out.println(root.val);
    }
     

}
