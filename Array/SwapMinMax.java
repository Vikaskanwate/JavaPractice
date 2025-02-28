package Array;

public class SwapMinMax {
    public static int min(int arr[]){
        int min = arr[0];
        for(int i = 0; i < arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    
    public static int max(int arr[]){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        int arr[] = {10,20,30};
        int temp = 0;
        int min = min(arr);
        int max = max(arr);

        System.out.println("minimum number from arr " + min + " maximum number from arr " + max);
        
        temp = min;
        min = max;
        max = temp;
        
        System.out.println("after swapping min is " + min  +" and max is " + max);
    }
}
