package Dictionary;
import java.util.*;

public class MapDic {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Prasanth", 2);
        map.put("SRividya", 1);
        System.out.println(map.get("Prasanth"));
    }
}
