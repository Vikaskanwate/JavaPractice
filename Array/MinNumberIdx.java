package Array;
public class MinNumberIdx {

    public static int min(int arr[]){
        int  min = arr[0],idx = 0;
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                idx = i;
                min = arr[i];
            }
        }
        return idx;
    }

    public static int max(int arr[]){
        int max = arr[0],idx = 0;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                idx = i;
                max = arr[i];
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,60,25,4,3,30};
        System.out.println("min value at index "+min(arr));
        System.out.println("max value at index "+max(arr));
    }
}