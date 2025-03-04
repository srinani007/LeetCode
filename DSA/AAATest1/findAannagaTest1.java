package AAATest1;

import java.util.ArrayList;
import java.util.List;

public class findAannagaTest1 {

    public static List<Integer> findAnnagaram(String s, String p){
        List<Integer> result = new ArrayList<>();
        int end = 0, start = 0, count = p.length();
        if (s.length() == 0 || p.length() > s.length()) return result;
        
        int[] charCount = new int[26];
        for( char c : p.toCharArray()){
            charCount[c-'a']++;
        }
        while (end < s.length()) {
            if(charCount[s.charAt(end++) - 'a']-- >= 1) count--;

            if(count == 0) result.add(start);

            if(end - start == p.length() && charCount[s.charAt(start++) - 'a']++ >= 0) count++;
            
        }
        return result;
    }
    public static void main(String[] args) {
        
        System.out.println(findAnnagaram("abba", "a"));
    }
}
