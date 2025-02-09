package Array;

public class Array3 {
    public static int sumOfArrayElements(int arr[]){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static double AvgOfArrayElements(int arr[]){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return (sum / arr.length);
    }
    public static String targetElement(int arr[],int target){
        for(int i = 0; i < arr.length; i++){
            if(target == arr[i]){
                return "found " + arr[i];
            }
        }
        return "not found";
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,50};
        System.out.println("sum of elements of array is " + sumOfArrayElements(arr));
        System.out.println("average of array elements is " + AvgOfArrayElements(arr));
        System.out.println("target " + targetElement(arr, 70));


    }
}
