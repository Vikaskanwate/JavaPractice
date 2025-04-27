package Array;

public class Sorted {
    static boolean isSorted(int arr[]){
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i -1])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        if (isSorted(arr)) {
            System.out.println("arr is sorted");
        }
        else 
            System.out.println("arr is not sorted");
    }

}
