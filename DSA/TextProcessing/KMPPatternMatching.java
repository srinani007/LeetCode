package TextProcessing;

public class KMPPatternMatching {
    public static void KMPSearch(String pattren, String text){
        int[] lps = computeLPSArray(pattren);
        int i = 0, j = 0;
        while (i < text.length()) {
            if (pattren.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }
            if (j == pattren.length()) {
                System.out.println("Pattern found at index " + (i - j));
                j = lps[j - 1];
            }else if (i < text.length() && pattren.charAt(j) != text.charAt(i)){
                if (j != 0) j = lps[j - 1];
                else i++;
            }
        }
    }
    private static int[] computeLPSArray(String pattren){
        int[] lps = new int[pattren.length()];
        int len = 0;
        int i = 1;
        while (i < pattren.length()) {
            if (pattren.charAt(i) == pattren.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }else{
                if (len != 0) len = lps[len - 1];
                else lps[i] = 0; i++;
            }
        }
        return lps;
    }
    public static void main(String[] args) {
        String text = "ABABDABACDABABCABAB";
        String pattren = "ABABCABAB";
        KMPSearch(pattren, text);
    }
}