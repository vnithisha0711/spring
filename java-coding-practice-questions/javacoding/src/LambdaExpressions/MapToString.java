package LambdaExpressions;

import java.util.HashMap;
import java.util.Map;

public class MapToString {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);
        map.put("date", 4);
        map.put("elderberry", 5);
        map.put("fig", 6);

        StringBuilder result = new StringBuilder();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result.append(entry.getKey()).append("=").append(entry.getValue()).append(", ");
        }

        if (result.length() > 0) {
            result.delete(result.length() - 2, result.length()); 
        }

        System.out.println(result);
    }
}



