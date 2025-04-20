
package Array;

import java.util.HashMap;
import java.util.Map;

public class MajorityEleBetter {

    // using java hashmap

    public static int findMajorityEle(int arr[]){
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i  = 0; i < n; i++){
            int value = map.getOrDefault(arr[i], 0);
            map.put(arr[i],value + 1);
        }

        for(Map.Entry<Integer,Integer> it : map.entrySet()){
            if(it.getValue() > n / 2)
                return it.getKey();
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]  = {2,2,1,1,2,3,2};
        System.out.println(findMajorityEle(arr) + "  is majority element in arr");    
    }
}
