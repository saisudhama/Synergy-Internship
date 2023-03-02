import java.util.HashMap;
import java.util.Map;

public class maps {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1", "person1");
        map.put("2", "person2");
        map.put("3", "person3");
        map.put("4", "person4");

        for (Map.Entry<String,String> m : map.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());
            
    }
}
