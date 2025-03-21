package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindCommon {
    public static void main(String[] args) {
        Integer arr1[] = {1,2,3,4,5,6};
        Integer arr2[] = {4,5,6,7,8};

        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1));

        Set<Integer> set2 = new HashSet<>(Arrays.asList(arr2));

        set1.retainAll(set2);
        System.out.println("common elements: " + set1);
    }
}