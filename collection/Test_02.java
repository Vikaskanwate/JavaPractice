package collection;

import java.util.HashMap;
import java.util.Map;

// Find the most frequent element in an array.
public class Test_02 {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,3,32,4,5};
        Map<Integer,Integer> freq = new HashMap<>();
        for(int num : arr){
            freq.put(num,freq.getOrDefault(num, 0)+1);
        } 
        System.out.println(freq);
    }
}
