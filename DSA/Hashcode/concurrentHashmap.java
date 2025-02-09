package Hashcode;

import java.util.concurrent.ConcurrentHashMap;

public class concurrentHashmap {
   public static void main(String[] args) {
    ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

    map.put(1, "A");
    map.put(2, "B");
    map.put(3, "C");
    map.put(4, "D");

    System.out.println(map.get(3));

    map.entrySet().removeIf(entry -> entry.getValue().equals("B"));
    System.out.println("After removing value B: " + map); 

    map.compute(2, (_, val) -> (val == null) ? "A" : val + "A");
    System.out.println("After computing value 1: " + map);
   } 

}
