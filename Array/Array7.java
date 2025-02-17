package Array;
// print the 2D array in java
public class Array7 {
    public static void printf(int arr[][]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
        }
    }
    public static void main(String args[]){
        int arr[][] = {
            {1,2,3},
            {2,3,4}
        };
        printf(arr);
    }
}