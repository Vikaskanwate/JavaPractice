package Array;
public class bubbleSort {

    public static void Sort(int arr[],int n){
        for(int i = 0; i < n -1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void printArr(int arr[], int n){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {5,1,3,2,4};
        Sort(arr, n);
        printArr(arr, n);
    }
}