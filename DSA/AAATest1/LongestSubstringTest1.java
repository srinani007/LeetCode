package AAATest1;

public class LongestSubstringTest1 {
    
    public int lengthOfLengthSubstring(String s){
        int[] chars = new int[128]; // There are 128 ASCII characters
        int left = 0, right = 0;
        int maxLength =0; 
        while (right < s.length()) {
            char r = s.charAt(right);
            chars[r]++;
            while (chars[r] > 1){
                char l = s.charAt(left);
                chars[l]--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }
    public static void main(String[] args) {
        LongestSubstringTest1 test = new LongestSubstringTest1();
        System.out.println(test.lengthOfLengthSubstring("abccabcbb")); // 3
    }
}