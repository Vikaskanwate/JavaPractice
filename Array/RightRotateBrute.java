package Array;

public class RightRotateBrute {
    public static void main(int arr[],int n, int d){
        d = d % n;
        int temp[] = new int[d];
        for(int i = 0; i < d; i++)
        {
            temp[i] = arr[i+(n-d)];
            System.out.println(temp[i]);
        }
        for(int i = 0; i < n-d; i++){
            arr[i+d] = arr[i]; 
        }
        for(int i = 0; i < d; i++){
            arr[i] = temp[i];
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        main(arr, arr.length, 2);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
