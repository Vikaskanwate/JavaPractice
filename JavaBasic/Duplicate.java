package JavaBasic;

import java.util.HashMap;
import java.util.Map;

public class Duplicate {
    
    // find duplicate characters using hashmap

    public static void main(String[] args) {
        String str = "programming";
        Map<Character,Integer> charCount = new HashMap<>();
        for(char ch : str.toCharArray()){
            if(charCount.containsKey(ch)){
                charCount.put(ch,charCount.get(ch) + 1);
            }
            else {
                charCount.put(ch, 1);
            }
        }

        System.out.println("Duplicate Characters: ");
        for(Map.Entry<Character,Integer> entry : charCount.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + "-" + entry.getValue() + " times");
            }
        }
    }
}
