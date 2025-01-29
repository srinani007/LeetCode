package Graphs;

public class LongestPalindrome {

    // public String longestPalindrome(String s) {
    //     if (s == null || s.length() < 1) {
    //         return "";
    //     }
    //     int start = 0, end = 0;
    //     for (int i = 0; i < s.length(); i++) {
    //         int len1 = expandAroundCenter(s, i, i);
    //         int len2 = expandAroundCenter(s, i, i + 1);
    //         int len = Math.max(len1, len2);
    //         if (len > end - start) {
    //             start = i - (len - 1) / 2;
    //             end = i + len / 2;
    //         }
    //     }
    //     return s.substring(start, end + 1);
    // }
    // private int expandAroundCenter(String s, int left, int right) {
    //     while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
    //         left--;
    //         right++;
    //     }
    //     return right - left - 1;
    // }
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n <= 1){
            return s;
        }
        int st = 0;
        int max_len = 1;

        for(int i = 0; i < n; i++){
            int l = i;
            int r = i;
            while(l >= 0 && r < n && s.charAt(l) == s.charAt(r)){
                l--;
                r++;
            }
            int len = r - l - 1;
            if(len > max_len){
                max_len = len;
                st = l + 1;
            }
        }

        for(int i = 0; i < n - 1; i++){
            int l = i;
            int r = i + 1;
            while(l >= 0 && r < n && s.charAt(l) == s.charAt(r)){
                l--;
                r++;
            }
            int len = r - l - 1;
            if(len > max_len){
                max_len = len;
                st = l + 1;
            }
        }
        return s.substring(st, st + max_len);
    }
    
    public static void main(String[] args) {
        LongestPalindrome solution = new LongestPalindrome();
        String s = "babad";
        String result = solution.longestPalindrome(s);
        System.out.println(result);
    }

}


