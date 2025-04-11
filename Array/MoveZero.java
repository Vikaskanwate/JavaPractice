package Array;

public class MoveZero {

    public static void zero(int arr[]){
        int j = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0 ){
                j = i;
                break;
            }
        }
        if(j == -1)
            System.out.println("array does not have any zero");

        for(int i = j+1; i < arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,0,0,20,0,40,0,50};
        zero(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
