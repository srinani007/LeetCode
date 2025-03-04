package AAATest1;

import java.util.Iterator;
import java.util.Map;

public class iterateMapHash {
    public static void main(String[] args) {
        Map<String, String> map = Map.of(
                "key1", "value1",
                "key2", "value2",
                "key3", "value3");

        iterateMapHash iterateMapHash = new iterateMapHash();
        iterateMapHash.iterateMap(map);
        System.out.println("Iterating using forEach:");
        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    public void iterateMap(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
