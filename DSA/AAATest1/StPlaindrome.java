package AAATest1;

public class StPlaindrome {
    public boolean isPalindrome(String str) {
        int left = 0, rigth = str.length() -1;
        while ( left < rigth) {
            if (str.charAt(left) != str.charAt(rigth)) return false;
            left++;
            rigth--;
        }
        return true;
    }
    public static void main(String[] args) {
        StPlaindrome pali = new StPlaindrome();
        String str = "madam";
        boolean results = pali.isPalindrome(str);
        if (results) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
