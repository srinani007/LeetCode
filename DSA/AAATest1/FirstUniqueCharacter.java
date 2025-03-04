package AAATest1;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String input = "aaaassssssp";

        Character firstUnique = input.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
        .entrySet().stream()
        .filter(entry -> entry.getValue() == 1)
        .map(Map.Entry::getKey)
        .findFirst().orElse(null);

        System.out.println("First unique character: " + firstUnique);
    }
}
