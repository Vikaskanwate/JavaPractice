package Array;

public class RotateLeft {
    static void left(int arr[]){
        int temp = arr[0];
        for(int i = 0; i < arr.length-1; i++){
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,20,20,50,40};
        left(arr);
    }
}
