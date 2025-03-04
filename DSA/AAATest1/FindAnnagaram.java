package AAATest1;

import java.util.ArrayList;
import java.util.List;

public class FindAnnagaram {
    public static void main(String[] args) {
        String s = "abab";
        String p = "ab";
        System.out.println(findAnna(s, p));
        
    }
    public static List<Integer> findAnna(String s, String p){
        List<Integer> list = new ArrayList<>();
        if (s.length() == 0 || p.length() > s.length()) return list;

        int[] charCount = new int[26];

        for(char c : p.toCharArray()){
            charCount[c-'a']++;
        }

        int start = 0, end = 0, count = p.length();

        while(end < s.length()){
            if (charCount[s.charAt(end++) - 'a'] -->= 1) count--;
                
            if (count == 0) list.add(start);
                
            if (end - start == p.length() && charCount[s.charAt(start++) - 'a']++ >= 0)  count++;
                
        }
        return list;
    }
}
