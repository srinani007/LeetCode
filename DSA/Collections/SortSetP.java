package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SortSetP {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        
        /*set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");
        set.add("Elderberry");
        set.add("Fig");
        set.add("Grape");
        set.add("Hawthorn");
        set.add("Ice Apple");*/

        Set<String> set2 = new LinkedHashSet<>();
        set2.add("Apple");
        set2.add("Banana");
        set2.add("Cherry");
        set2.add("Date");
        set2.add("Elderberry");
        set2.add("Fig");
        set2.add("Grape");
        set2.add("Hawthorn");
        set2.add("Ice Apple");


        try {
            List<String> sortedFruitList = new ArrayList<>(set2);
            Collections.sort(sortedFruitList);
            System.out.println("Sorted Fruit List: " + sortedFruitList);
        } catch (Exception e) {
            System.err.println("Error sorting the set: " + e.getMessage());
        }
        //System.out.println(set);
        System.out.println(set2);

        
    }
}
