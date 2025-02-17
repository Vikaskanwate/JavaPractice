package Array;
public class Array8 {

    // remove duplicate element from array 

    public static int removeDuplicate(int arr[]){
        int idx = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                arr[idx++] = arr[i];
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,3,4};
        int newIdx = removeDuplicate(arr);
        for(int i = 0; i < newIdx; i++){     
            System.out.print(arr[i] + " ");
        }
    }
}
