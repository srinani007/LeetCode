package AAATest1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

import java.util.stream.Collectors;

/**
 * The AreOccurrencesEquals class provides methods to check if all characters in a given string
 * have the same number of occurrences.
 * 
 * <p>It includes three methods:
 * <ul>
 *   <li>{@link #areOccurrencesEqual(String)}: Uses an array to count character frequencies.</li>
 *   <li>{@link #optimized(String)}: Uses a HashMap to count character frequencies and a HashSet to check if all frequencies are the same.</li>
 *   <li>{@link #equals(String)}: Uses Java Streams to count character frequencies and check if all frequencies are the same.</li>
 * </ul>
 * 
 * <p>Example usage:
 * <pre>
 * {@code
 * String s = "abaccbc";
 * boolean result = AreOccurrencesEquals.areOccurrencesEqual(s);
 * System.out.println(result); // Output: false
 * }
 * </pre>
 */
public class AreOccurrencesEquals {
    public static void main(String[] args) {
        String s = "abaccbc";
        System.out.println(optimized(s));
    }
    /**
     * Checks if all characters in the given string have the same number of occurrences.
     *
     * @param s the input string consisting of lowercase English letters
     * @return true if all characters in the string have the same number of occurrences, false otherwise
     */
    public static boolean areOccurrencesEqual(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray())
            count[c - 'a']++;
        int frequency = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                if (frequency == 0) {
                    frequency = count[i];
                } else if (frequency != count[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    
    public static boolean optimized(String str){
        Map<Character, Integer> count = new HashMap<>();
        for (char c : str.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        Set<Integer> frequencies = new HashSet<>(count.values());
        return frequencies.size() == 1;
    }


    public static boolean equals(String s){
        return s.chars()
        .boxed()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        .values()
        .stream()
        .distinct()
        .count() == 1;
    }
}
