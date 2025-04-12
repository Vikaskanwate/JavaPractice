package Array;

public class LongestSubarray {
    public static int longestSubarray(int arr[] , long k){
        int len = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                long s = 0;
                for(int K = i; K <= j; K++){
                    s += arr[K];
                }
                if(s == k)
                    len = Math.max(len, j-i+1);
            }
        }
        return len;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,1,3,4,5,2,1,1,1};
        int k = 3;
        int len  = longestSubarray(arr, k);
        System.out.println("length of longest subarray "+len);
    }
}
