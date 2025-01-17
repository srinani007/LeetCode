package Graphs;


public class lengthOflongestPal {
    // public static int lenghtOflongestSubstring(String s){
    //     if(s == null || s.length() == 0){
    //         return 0;
    //     }
    //     HashMap<Character, Integer> charMap = new HashMap<>();
    //      int start = 0;
    //      int maxLength = 0;

    //      for(int end = 0; end < s.length(); end++){
    //         char currentChar = s.charAt(end);
    //         if(charMap.containsKey(currentChar) && charMap.get(currentChar) >= start){
    //             start = charMap.get(currentChar) + 1;
    //         }
    //         charMap.put(currentChar, end);
    //         maxLength = Math.max(maxLength, end - start + 1);
    //     }
    //     return maxLength;
    // }
    public static int lenghtOflongestSubstring(String s){
       int[] map = new int[256];
       int left = 0, max = 0;
       for(int right = 0; right < s.length(); right++){
        left = Math.max(left, map[s.charAt(right)]);
        map[s.charAt(right)] = right + 1;
        max = Math.max(max, right - left + 1);
       }
       return max;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int result = lenghtOflongestSubstring(s);
        System.out.println(result);
    }
}
