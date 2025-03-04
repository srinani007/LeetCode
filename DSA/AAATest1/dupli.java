package AAATest1;

import java.util.HashMap;
import java.util.Map;

public class dupli {
    public static void main(String[] args) {
        String input = "Hello, World! This is a test string.";
        dupli duplicateFinder = new dupli();
        duplicateFinder.findDup(input);
    }
    public void findDup(String input){
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : input.toCharArray()) {
            charCount.put(c,  charCount.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " appers :" + entry.getValue() + " times");
            }
        }
    }
}
