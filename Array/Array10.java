package Array;
public class Array10{
    // reverse array
    public static void revArray(int arr[]){
        for(int i = arr.length-1;i >= 0;i--){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30};
        System.out.println("reversed array is ");
        revArray(arr);
    }
}