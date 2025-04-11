package Array;

public class LeftRotateOptimal {
    public static void Reverse(int arr[],int start,int end){
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void leftRotate(int arr[],int n, int d){
        Reverse(arr, 0, d-1);
        Reverse(arr,d,n-1);
        Reverse(arr,0, n-1);

    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        // Reverse(arr, 0, arr.length-1);
        leftRotate(arr, arr.length, 2);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

