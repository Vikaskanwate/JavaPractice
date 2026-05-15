package JavaBasic;

import java.util.HashMap;
import java.util.HashSet;

// Q1. Majority Element (appears more than n/2 times)
// Input: {3, 3, 4, 2, 3, 3, 5}
// Output: 3  
public class Test_32 {
    public static void main(String[] args) {
        int arr [] = {3,3,4,2,3,3,5};
        // using hashmap frequency counter
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int n : arr){
            count.put(n,count.getOrDefault(n,0) +1);
            if(count.get(n) > arr.length / 2){
                System.out.println(n);
                return;
            }
        }
        
        // using hashset
        HashSet<Integer> visited = new HashSet<>();
        for(int num : arr){
            int cnt = 0;
            if(!visited.contains(num)){
                for(int j = 0; j < arr.length; j++){
                    if(arr[j] == num){
                        cnt++;
                    }
                }
                visited.add(num);
            }
            if(cnt > arr.length / 2){
                System.out.println("Mejority element is: "+num);
                break;
            }
        }
    }
}
