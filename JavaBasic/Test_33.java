package JavaBasic;

import java.util.HashSet;

// Q4. Find the First Duplicate Element
// Input: {2, 5, 1, 2, 3, 5, 1}
// Output: 2 
public class Test_33 {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 5, 3, 5, 1 };
        HashSet<Integer> duplicate = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            // for (int j = i + 1; j < arr.length; j++) {
            //     if (arr[i] == arr[j]) {
            //         System.out.println(arr[i]);
            //         return;
            //     }
            // }
            if(duplicate.contains(arr[i])){
                System.out.println(arr[i]);
                return;
            }else{
                duplicate.add(arr[i]);
            }
        }
    }
}