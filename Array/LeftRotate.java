package Array;

public class LeftRotate {

    // left rotate by d places
    static public void Reverse(int arr[],int start,int end){
        while (start <= end) {
            int temp=arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static public void leftRotate(int arr[],int n,int d){
        LeftRotate.Reverse(arr, 0,d-1);
        LeftRotate.Reverse(arr, d, n-1);
        LeftRotate.Reverse(arr, 0, n-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        int d = 3;
        leftRotate(arr, n, d);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
