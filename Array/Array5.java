package Array;
public class Array5 {
    //  linear seach example
    public static void main(String main[]){
        int [] number = {5,2,8,1,9,3,6};
        int target = 9;

        int result = linearSeacrch(number,target);
        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
    public static int linearSeacrch(int arr[],int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
