package Serialization;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringFinder {
   public int LengthOflongestSubstring(String s){
    Set<Character> set = new HashSet<>();
    int left = 0, maxLen = 0;

    for(int right = 0; right < s.length(); right++){
        while(!set.add(s.charAt(right))){
            set.remove(s.charAt(left++));
        }
        maxLen = Math.max(maxLen, right - left + 1);
    }
    return maxLen;

   }
    public static void main(String[] args) {
         LongestSubstringFinder m = new LongestSubstringFinder();
         System.out.println(m.LengthOflongestSubstring("abcabcbb"));
    }
}
