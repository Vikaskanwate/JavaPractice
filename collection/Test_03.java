package collection;

import java.util.LinkedHashMap;
import java.util.Map;

// First non-repeating character in a string.
public class Test_03 {
    public static void main(String[] args) {
        String str = "aabbc";
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char c: str.toCharArray()){
            map.put(c,map.getOrDefault(c, 0)+1);
        }
        // System.out.println(map);
        for(Map.Entry<Character, Integer> e : map.entrySet()){
            if(e.getValue() == 1) {
                System.out.println(e.getKey());
                return;
            }
        }
    }
}
