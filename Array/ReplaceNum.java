package Array;

public class ReplaceNum {

    public static int replace(int arr[],int pos,int num){
        for(int i = 0; i < arr.length; i++){
            if(pos == i){
                arr[i] = num;
            }
        }
        return 0;
    }
    public static void main(String args[]){
        int arr[] = {10,20,30};

        replace(arr, 0, 50);

        for(int a : arr){
            System.out.print(a + " ");
        }
    }
}
