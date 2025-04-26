package Array;

import java.util.ArrayList;

public class LeadersInArray {
   static ArrayList<Integer> leader(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean leader = true;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    leader = false;
                    break;
                }
            }
            if(leader) 
                ans.add(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {10,22,12,5,0,6};
        for (int i : leader(arr)) {
            System.out.print(i + " ");
        }
    }
}
