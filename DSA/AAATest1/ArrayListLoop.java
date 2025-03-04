package AAATest1;

import java.util.Arrays;
import java.util.List;

public class ArrayListLoop {
   public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
    ArrayListLoop arrayListLoop = new ArrayListLoop();
    arrayListLoop.iterateList(list);
    System.out.println("List size: " + list.size());
   }

   public void iterateList(List<Integer> list){
    for (int i = 0; i < list.size(); i++) {
        System.out.println(list.get(i));    
    }
    System.out.println("************" );
    int j = 0;
    while ( j < list.size()) {
        System.out.println(list.get(j));
        j++;
    }
    System.out.println("************" );

    for ( Integer num : list) System.out.println(num);
    System.out.println("************" );
   }
}
