package Array;
// rotate array by the 1 places
public class RotateArray {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int temp = arr[0];
        for(int i = 1; i < arr.length; i++){
            arr[i - 1] = arr[i];
        }
        arr[arr.length -1 ] = temp;

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
