package Array;
public class Array6 {
    public static int Max(int arr[]){
        int max = arr[0];
        for(int i = 0; i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;

    }
    public static void main(String args[]){
        int arr[] = {10,20,50,40};
        System.out.println(Max(arr));
    }
}