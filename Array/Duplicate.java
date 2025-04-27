package Array;

public class Duplicate {
    static int removeDuplicate(int arr[]){
        int i = 0;
        for(int j = 1; j < arr.length; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,40,50,50};
        for(int i = 0; i < removeDuplicate(arr); i++){
            System.out.print(arr[i] + " ");
        }
    }
}
