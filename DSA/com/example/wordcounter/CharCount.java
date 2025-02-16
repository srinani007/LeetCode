package com.example.wordcounter;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
    public void findDupilicates(String input){
        HashMap<Character, Integer> charMap = new HashMap<>();
        for(char c : input.toCharArray()){
            charMap.put(c,charMap.getOrDefault(c, 0)+1);
        }
        for(Map.Entry<Character, Integer> entry : charMap.entrySet()){
            if (entry.getValue() >= 2) {
                System.out.println(" -> " + entry.getKey() + " : " + entry.getValue() + " -> "); 
            }
        }
    }
    public static void main(String[] args) {
        CharCount charCount = new CharCount();
        charCount.findDupilicates("Java is a programming language");

        
    }
}
