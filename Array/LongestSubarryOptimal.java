package Array;

public class LongestSubarryOptimal {
    static int longest(int arr[],int n, int k){
        int right = 0, left = 0;
        int maxLen = 0;
        int sum = arr[0];
        while(right < n){
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if(sum == k) 
                maxLen = Math.max(maxLen,right - left + 1);
            right++;
            if(right < n)
                sum += arr[right];
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,1,1};
        int len = longest(arr, arr.length, 3);
        System.out.println("maximum length of subarray " + len);
    }
}
