package Array;

import java.util.Arrays;

public class TwoSumOptimal {
    static void Optimal(int  arr[], int sum){
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int s = arr[left] + arr[right];
            if(s == sum){
                System.out.println("elemnts found ");
                break;
            }else if(s < sum) 
                left++;
            else
                right--;
        } 
        return;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,45};
        Optimal(arr, 50);
    }
}
