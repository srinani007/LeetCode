package iterator;

import java.util.Iterator;

public class printIterator {
    public static void print(Iterator<?> iterator) {
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
