package Array;
public class IsSorted{
    public static boolean isSorted(int arr[]){
        for(int i = 1; i < arr.length; i++){
            if(arr[i] >= arr[i - 1]){
                
            }
            else 
                return false;
        }
        return true;
    }
    public static void main(String args[]){
        int arr[] ={10,20,30,40};
        if(isSorted(arr)){
            System.out.println("array is sorted");
        }else {
            System.out.println("array is not sorted");
        }
    }
}