package Array;

public class SubArraySum {

    public static long maximumSubArray(int arr[]){
        long maxi = Long.MIN_VALUE;
        long sum = 0;
        for(int i = 0; i < arr.length; i++){

            sum += arr[i];
            if(sum > maxi){
                maxi = sum;
            }

            if(sum < 0){
                sum = 0;
            }
            if (maxi < 0) maxi = 0;
        }

        return maxi;

    }
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("maximum subarray sum is "+maximumSubArray(arr));
    }
}
