package Array;


public class RarrangeArray {

    public static void main(String[] args) {
        int arr[] = {3,1,-2,-5,2,-4};
        
        int []pos = new int[arr.length/2];
        int []neg = new int[arr.length/2];
        int j = 0, k = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                pos[j++] = arr[i];
            }
            else {
                neg[k++] = arr[i];
            }
        }
        for(int i = 0; i < arr.length/2; i++){
            arr[2 * i] = pos[i];
            arr[2 * i + 1] = neg[i];
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}