package Array;
// max and min in array
public class Array1{
    @SuppressWarnings("unused")
    public static int length(int arr[]){
        int len = 0;
        for(int i:arr){
            len++;
        }
        return len;
    }
    public static int max(int arr[]){
        int a = Integer.MIN_VALUE;
        for(int i = 0; i < length(arr);i++){
            if(arr[i] > a){
                a = arr[i];
            }
        }
        return a;
    }
    public static int min(int arr[]){
        int a = Integer.MAX_VALUE;
        for(int i = 0; i < length(arr);i++){
            if(arr[i] < a){
                a = arr[i];
            }
        }
        return a;
    }
    public static void main(String args[]){
        int arr[] = {30,12,15,80};
        length(arr);
        System.out.println("Max value is :"+max(arr));
        System.out.println("Min value is :"+min(arr));
    }
}