package JavaBasic;
// duplicate character in string

import java.util.HashMap;
import java.util.Map;

public class DuplicateString {

    public static void main(String[] args) {
        String str = "programming";
        Map<Character,Integer> countCharAt = new HashMap<>(); 
        for (char ch : str.toCharArray()) {
            if(countCharAt.containsKey(ch)){
                countCharAt.put(ch,countCharAt.get(ch) + 1);   
            }else
                countCharAt.put(ch,1);
        }

        System.out.println("Duplicate characters ");
        for(Map.Entry<Character,Integer> entry : countCharAt.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + "-" + entry.getValue() + " times");
            }
        }
    }

}
