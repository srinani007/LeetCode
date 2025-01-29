package Collections;
import java.util.*;

public class SetIntersection {
    public static void main(String[] args) {
        Set<String> courseA = new HashSet<>(Arrays.asList("Alice", "Bob", "Charlie"));
        Set<String> courseB = new HashSet<>(Arrays.asList("Bob", "David", "Charlie"));
        
        courseB.removeAll(courseA);

        // courseA.retainAll(courseB); // Intersection (common elements)

        // System.out.println("Students in both courses: " + courseA);
        System.out.println("Students in both courses: " + courseB);
    }
}