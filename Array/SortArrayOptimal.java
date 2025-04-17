package Array;
// sort 0's ,1's and 2's
public class SortArrayOptimal {

    static void swap(int arr[],int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void sort(int arr[]){
        int n = arr.length;
        int low = 0,mid = 0,high = n-1;
        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr,low,mid);
                mid++;
                low++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,0,1,2,1,2,0,0,0,1};
        sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
