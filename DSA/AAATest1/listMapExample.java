package AAATest1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class listMapExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList( "John", "Mary", "David", "Emma");
        Map<String, Integer> namesLength = names.stream()
        .collect(Collectors.toMap(name -> name, String::length)); // Collectors.toMap(keyMapper, ValueMapper)
        System.out.println(namesLength);
    }
}
