package Array;

public class linearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int target = 4;
        for(int i = 0; i < arr.length; i++){    
            if(arr[i] == target){
                System.out.print("target found at index " +i);
            }
        }
    }
}
