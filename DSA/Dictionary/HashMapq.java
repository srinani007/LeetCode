package Dictionary;
import java.util.HashMap;

public class HashMapq {
    public static void main(String[] args) {
        HashMap<String, Integer> hashmap = new HashMap<>();
        hashmap.put("Apple", 1);
        hashmap.put("Orange", 2);
        System.out.println(hashmap.get("Orange"));
    }
}
