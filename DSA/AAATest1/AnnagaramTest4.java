package AAATest1;

public class AnnagaramTest4 {

    public static boolean isAnagramTest(String str1, String str2) {
        // remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        // check if length are different
        if (str1.length() != str2.length())
            return false;
        // Array to store character counts (Assuming ASCII characters)
        int[] charCount = new int[26];
        // count character in first string
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i) - 'a']++;
            charCount[str2.charAt(i) - 'a']--;
        }
        // if all count are 0, strings are anagrams
        for (int count : charCount)
            if (count != 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        String test1 = "Listen";
        String test2 = "Silent";
        System.out.println();
        System.out.println("Using sorting method: ");
        System.out.println(test1 + " and " + test2 + " are anagrams: "
                + isAnagramTest(test1, test2));
        System.out.println();
        System.out.println("Using counting method: ");
        System.out.println(test1 + " and " + test2 + " are anagrams: "
                + isAnagramTest(test1, test2));
        System.out.println();

    }
}
