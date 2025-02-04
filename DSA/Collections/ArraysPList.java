package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;


public class ArraysPList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("GO");
        System.out.println(list);

        List<String> list2 = new LinkedList<>();
        list2.add("b");
        list2.add("a");
        list2.add("c");
        list2.add("GO");
        long a = list2.stream().count();
        System.out.println(list2);
        System.out.println(a);

        List<String> list3 = new Vector<>();
        list3.add("Javba");
        list3.add("Java");
        list3.add("Python");
        list3.add("GO");
        // how to sort the list 
        Collections.sort(list3);
        System.out.println(list3);

        List<String> list4 = new Stack<>();
        list4.add("GO");
        list4.add("Java");
        list4.add("Python");
        list4.add("j");
        System.out.println(list4);

    }
}
