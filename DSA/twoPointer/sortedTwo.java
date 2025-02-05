package twoPointer;

public class sortedTwo {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        
        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if(sum == target){
                return new int[]{left+1, right+1};
            }else if (sum < target) {
                left++;
            }else {
                right--;
            }
        }
        return new int[]{-1,-1};
        
    }

    
    public static void main(String[] args) {
        sortedTwo s = new sortedTwo();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = s.twoSum(numbers, target);
        for (int i : result) {
            System.out.println(i);
        }
        
    }
}
