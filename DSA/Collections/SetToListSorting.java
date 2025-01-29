package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToListSorting {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(Arrays.asList(10,5,3,2,6,32));
        List<Integer> numIntegers = new ArrayList<>(numbers);
        Collections.sort(numIntegers, Collections.reverseOrder());
        System.out.println(numIntegers);
    }
}
