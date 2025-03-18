package Array;

public class FindMinMax {
    public static void MinMax(int arr[]){
        int min = arr[0];
        int max = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }else if(max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println("minimum number is " + min);
        System.out.println("maximum number is " + max);
    }

    public static void main(String[] args) {
        int arr[] = {10,20,5,70,50};
        MinMax(arr);
    }
}
