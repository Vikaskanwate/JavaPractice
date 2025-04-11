package Array;

public class LeftRotateBrute {

    public static void main(int arr[], int n, int d){
        d = d %n;
        int temp[] = new int[d];
        for(int i = 0; i < d; i++){
            temp[i] = arr[i];
        }
        for(int i = d; i < n; i++){
            arr[i - d] = arr[i];
        }

        for(int i = n-d; i < n; i++){
            arr[i] = temp[i-(n-d)];
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
