package SwitchCase;
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {1, 1, 3, 4, 3, 4, 3, 4, 1, 3, 4, 3, 5, 5, 5}; // Ensure this is the same
        int majorityElement = findMajorityElement(nums);
        System.out.println("The majority element is: " + majorityElement);
    }

    public static int findMajorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        // Phase 1: Find a candidate for majority element
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Phase 2: Verify the candidate
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        // Debugging output
        System.out.println("Candidate: " + candidate);
        System.out.println("Count of candidate in array: " + count);

        // Check if the candidate is indeed the majority
        if (count > nums.length / 2) {
            return candidate;
        }

        // If no majority element exists, return -1 or any other indication
        return -1; 
    }
}

