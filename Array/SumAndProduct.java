package Array;
public class SumAndProduct {
    public static int sum(int arr[]){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int product(int arr[]){
        int mul = 1;
        for(int i = 0; i < arr.length; i++){
            mul *= arr[i];
        }
        return mul;
    }
    public static String proSum(int arr[]){
        return ( "sum of array " +sum(arr) + " product of array " + product(arr));
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30};
        System.out.println(proSum(arr));
    }
}
