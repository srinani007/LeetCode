package AAATest1;

import java.util.HashMap;
import java.util.Map;

public class countWords {
    public static void main(String[] args) {
        String input = "Hello, World! This is a test string.";

        countWords wordCounter = new countWords();
       
        Map<String, Integer> wordCount = wordCounter.countWordsInString(input);
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("Total unique words: " + wordCount.size());
    }

    public Map<String, Integer> countWordsInString(String input) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = input.split("\\s+");
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }
}
