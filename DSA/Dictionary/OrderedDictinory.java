package Dictionary;
import java.util.Map;
import java.util.LinkedHashMap;;

public class OrderedDictinory {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Prashu", 2);
        map.put("Vidya", 99);

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+ " : "+entry.getValue());
        }
    }
}
