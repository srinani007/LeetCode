
public class MinimumWindowSubstring{
    public static String minWindow(String s, String t) {
            String resultStr = "";
            int[] tcount = new int[128];
            int left = 0, right = 0, found = 0, minWindowLen = Integer.MAX_VALUE, toFind = t.length();

            if(t.length() > s.length()) return resultStr;
            for(char c : t.toCharArray()) tcount[c]++;
            
            char[] sChr = s.toCharArray();
            
            while(right < sChr.length){
                char c = sChr[right];
                tcount[c]--;
                if(tcount[c] >= 0) found++;
                while(found == toFind){
                    if(right - left + 1 < minWindowLen){
                        minWindowLen = right - left + 1;
                        resultStr = s.substring(left, right + 1);
                    }
                    tcount[sChr[left]]++;
                    if(tcount[sChr[left]] > 0) found--;
                    left++;
                }
                right++;
            }
            return resultStr;
        } 
        public static void main(String[] args) {
            String s = "ADOBECODEBANC";
            String t = "ABC";
            String result = minWindow(s, t);
        System.out.println(result);
    }
}