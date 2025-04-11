package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionOfArr {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {4,5,6,7,8,9};
        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int i = 0; i < arr2.length; i++){
            set.add(arr2[i]);
        }
        List<Integer> list = new ArrayList<>(set); 
        for(int i : list){
            System.out.print(i+" ");
        }
    }
}