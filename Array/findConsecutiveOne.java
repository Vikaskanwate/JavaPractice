package Array;

public class findConsecutiveOne {
    // find consecutive one in the array
    static int one(int arr[]){
        int cnt = 0;
        int maxi = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1)
                cnt++;
            else 
                cnt = 0;
            
            maxi = Math.max(maxi, cnt);
        }
        return maxi;
    }
    public static void main(String[] args) {
        int nums[] = { 1, 1, 0, 1, 1, 1 };
        System.out.println(" The maximum  consecutive 1's are  "+one(nums) );
    }
}
