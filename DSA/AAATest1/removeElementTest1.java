package AAATest1;

public class removeElementTest1 {
    public  int removeElemnt(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        removeElementTest1 test = new removeElementTest1();
        int result = test.removeElemnt(nums, val);
        for (int i = 0; i < result; i++) {
            System.out.println(nums[i]);
            }
    }
}