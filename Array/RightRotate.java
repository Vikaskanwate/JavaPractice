package Array;

public class RightRotate {
    public static void Reverse(int arr[], int start ,int end){
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void rightRotate(int arr[],int n,int d){
        RightRotate.Reverse(arr, n-d, n-1);
        RightRotate.Reverse(arr, 0, n-d-1);
        RightRotate.Reverse(arr, 0, n-1);
    
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        int d = 3;
        rightRotate(arr, n, d);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
