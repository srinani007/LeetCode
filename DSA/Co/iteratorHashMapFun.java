package Co;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class iteratorHashMapFun {

   public void iterateHashMap(Map<String, String> map) {
    for (Map.Entry<String, String> entry : map.entrySet()) {
        System.out.println(entry.getKey() + " -> " + entry.getValue());
    }

    Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
    while (iterator.hasNext()) {
        Map.Entry<String, String> entry = iterator.next();
        System.out.println(entry.getKey() + " ->" + entry.getValue());
    }
   }

    public static void main(String[] args) {
         iteratorHashMapFun i = new iteratorHashMapFun();
         Map<String, String> map = new HashMap<>();
         map.put("Prasant", "Cool");
         map.put("Am", "Cooler");
         i.iterateHashMap(map);
    }
}
