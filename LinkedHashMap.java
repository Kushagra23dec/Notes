// use this as LinkedHashMap preserves the insertion order.
  

import java.util.*;
public class Main {
    public static void main(String args[]) {
                LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
          map.put("a", 1);
          map.put("b", 2);
          map.put("c", 3);


        // System.out.println("First entry: " + key + " -> " + value);

        map.put("a",9);

        map.remove("a");

        Map.Entry<String, Integer> firstEntry = map.entrySet().iterator().next();
        String key = firstEntry.getKey();
        Integer value = firstEntry.getValue();

        System.out.println("First entry: " + key + " -> " + value);


    }
}
