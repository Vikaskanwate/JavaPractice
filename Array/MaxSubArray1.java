package Array;

public class MaxSubArray1 {
    public static void main(String[] args) {
        int arr[] = {10,20,-10,50};
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(var i : arr){
            currSum += i;
            maxSum  = Integer.max(currSum, maxSum);
            if(currSum < 0){
                currSum = 0;
            }
        }
        System.out.println(maxSum);
    }
}
