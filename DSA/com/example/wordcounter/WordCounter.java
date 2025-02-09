package com.example.wordcounter;

import java.util.HashMap;
import java.util.Map;


public class WordCounter {

    public Map<String, Integer> countWords(String input) {
        if (input == null || input.isEmpty()) {
            return new HashMap<>();
        }

        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = input.toLowerCase().split("\\s+");

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }

    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter();
        String input = "I am a good";
        Map<String, Integer> wordCount = wordCounter.countWords(input);

        

        // Print the word count
        wordCount.forEach((word, count) -> System.out.println(word + ": " + count));

        wordCount.forEach((word, count) -> System.out.print(word + ": " + count + ", "));
    }
}