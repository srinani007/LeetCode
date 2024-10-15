package TREENODE;

public class createTree {
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
     

}
