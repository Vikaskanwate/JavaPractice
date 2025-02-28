package Array;
public class ReverseArray {

    public static void Reverse(int arr[]){
        int st = 0, end = arr.length -1;
        int temp;
        while (st < end) {
            temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;

            st++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40};
        // here the concept of call by reference which mean that chenging in the original array by going to that address
        Reverse(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
