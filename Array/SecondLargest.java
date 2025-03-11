package Array;

public class SecondLargest {
    public static int sec(int arr[]){
        int largest = Integer.MIN_VALUE;
        int seclg = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length;i++){
            if(largest < arr[i]){
                seclg = largest;
                largest = arr[i];
            }else if(seclg != largest && seclg < arr[i]){
                seclg = arr[i];
            }
        }
        return seclg;
    }
    public static void main(String[] args) {
        int arr[]= {50,60,70,80};
        System.out.println(sec(arr));
    }
}
