
package Array;
public class RemoveDuplicate {

    public static int removeDuplicate(int arr[]){
        int i = 0;
        for(int j = 1;j < arr.length; j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,20,30,30,40};

        int a = removeDuplicate(arr);

        for(int i = 0; i < a; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
