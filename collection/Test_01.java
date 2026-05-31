package collection;

import java.util.HashSet;
import java.util.Set;

// find duplicate element in array
public class Test_01 {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,3,32,4,5};
        Set<Integer> seen = new HashSet<>();
        for(int num : arr){
            if(!seen.add(num)){
                System.out.print(num + " ");
            }
        }
    }
}
