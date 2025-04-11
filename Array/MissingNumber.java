package Array;

public class MissingNumber{
    static int findMissingNumber(int arr[]){
        for(int i = 1; i <= arr.length; i++){
            int flag = 0;
            for(int j = 0; j < arr.length-1; j++){
                if(arr[j] == i){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        System.out.println("The missing number is "+findMissingNumber(arr));
        
    }
}