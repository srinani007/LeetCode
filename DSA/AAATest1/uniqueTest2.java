package AAATest1;

public class uniqueTest2 {
    public static void main(String[] args) {
        String input = "abbas";
        char result = finduniqe(input);
        System.out.println(result);
        
    }
    public static char finduniqe(String s) {
        int[] count = new int[26];

        for(char c : s.toCharArray()){
            count[c - 'a']++;
        }

        for(char c : s.toCharArray()){
            if (count[c - 'a'] == 1) return c;
        }
        return ' ';
    }
}
