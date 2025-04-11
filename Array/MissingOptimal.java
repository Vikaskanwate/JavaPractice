package Array;

public class MissingOptimal {
    static int findMissingNumber(int arr[],int n){
        int sum = n * (n + 1) / 2;
        int s2 = 0;
        for(int i = 0; i < n-1; i++){
            s2 += arr[i];
        }
        return sum - s2;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        int number = findMissingNumber(arr, arr.length);
        System.out.println("missing number is "+number);
    }
}
