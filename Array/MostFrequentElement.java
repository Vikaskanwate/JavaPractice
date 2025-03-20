package Array;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement{

    public static int mostFrequent(int arr[]){
        Map<Integer,Integer> freqMap = new HashMap<>();
        int maxCount = 0,mostFrequentElement = arr[0];

        for(int num : arr){
            int count = freqMap.getOrDefault(freqMap,0) + 1;
            freqMap.put(num, count);

            if(count > maxCount){
                maxCount = count;
                mostFrequentElement  = num;
            }
        }
        return mostFrequentElement;
    }

    public static void main(String[] args) {
        int arr[]= {10,20,0,10,30,40,50};
        System.out.println("most frequent element: " + mostFrequent(arr));

    }
}