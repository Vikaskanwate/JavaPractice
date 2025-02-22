package Array;
public class Remove{
    public static int rem(int arr[],int key){
        int idx = 0;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] != key){
                arr[idx++] = arr[i];
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,10,20};
        int a = rem(arr, 20);
        for(int i = 0; i < a;i++){
            System.out.print(arr[i] + " ");
        }
    }
}