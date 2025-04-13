package Array;
// littel bit better approch
public class LongestSubarray1 {

    static int longest(int arr[],int n, int k){
        int len = 0;
        for(int i = 0; i < n; i++){
            int s = 0;
            for(int j = i; j < n; j++){
                s += arr[j];

                if(s == k) 
                    len = Math.max(len, j - i + 1);
            }
        }
        return len;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,1,1,3,4,5,2,1,1,1};
        int len = longest(arr, arr.length, 3);
        System.out.println("length of longest sub array is " + len);
    }
}
